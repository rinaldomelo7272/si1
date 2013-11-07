import java.util.HashMap;


public class NumberText {
	
	public static String getNumberText(String number) {
		
		HashMap<String, String> TABELA = new HashMap<>();
	
		
		TABELA.put("0", "zero"); TABELA.put("1", "um"); TABELA.put("2", "dois");
		TABELA.put("3", "tres"); TABELA.put("4", "quatro"); TABELA.put("5", "cinco");
		TABELA.put("6", "seis"); TABELA.put("7", "sete"); TABELA.put("8", "oito");
		TABELA.put("9", "nove"); TABELA.put("11", "onze"); TABELA.put("12", "doze"); 
		TABELA.put("13", "treze"); TABELA.put("14", "quatorze"); TABELA.put("10", "dez");
		TABELA.put("15", "quinze"); TABELA.put("16", "desseseis"); TABELA.put("17", "dezessete"); 
		TABELA.put("18", "dezoito"); TABELA.put("19", "dezenove"); TABELA.put("20", "vinte"); 
		TABELA.put("30", "trinta"); TABELA.put("40", "quarenta"); TABELA.put("50", "cinquenta");
		TABELA.put("60", "sessenta"); TABELA.put("70", "setenta"); TABELA.put("80", "oitenta");
		TABELA.put("90", "noventa"); 
		
		if (TABELA.get(number)==null) {
			return TABELA.get(number.charAt(0)+"0") + " e " + TABELA.get(number.charAt(1)+"");
		}
		
		return TABELA.get(number);
	}

}
	