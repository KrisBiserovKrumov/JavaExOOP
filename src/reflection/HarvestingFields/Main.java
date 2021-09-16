package reflection.HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();

		Field[] field = RichSoilLand.class.getDeclaredFields();

		while (!input.equalsIgnoreCase("HARVEST")){

			String finalInput = input;
			Field[] requestedFields = Arrays.stream(field).filter(f ->
				Modifier.toString(f.getModifiers()).equalsIgnoreCase(finalInput)
			).toArray(Field[]::new);

			if (requestedFields.length != 0){
				Arrays.stream(requestedFields).forEach(f-> System.out.println(String.format(
						"%s %s %s",Modifier.toString(f.getModifiers()),f.getType().getSimpleName(),f.getName()
				)));
			}else {
				Arrays.stream(field).forEach(f-> System.out.println(String.format(
						"%s %s %s",Modifier.toString(f.getModifiers()),f.getType().getSimpleName(),f.getName()
				)));

			}


			input = reader.readLine();
		}

	}
}
