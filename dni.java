package dni;

public class dni {
	
	private int num;
	private String dni;
	
	public static char letra(int num) {
		
		if(num%23 == 0) {
			return 'T';
		}else if(num%23 == 1){
			return 'R';
		}else if(num%23 == 2){
			return 'W';
		}else if(num%23 == 3){
			return 'A';
		}else if(num%23 == 4){
			return 'G';
		}else if(num%23 == 5){
			return 'M';
		}else if(num%23 == 6){
			return 'Y';
		}else if(num%23 == 7){
			return 'F';
		}else if(num%23 == 8){
			return 'P';
		}else if(num%23 == 9){
			return 'D';
		}else if(num%23 == 10){
			return 'X';
		}else if(num%23 == 11){
			return 'B';
		}else if(num%23 == 12){
			return 'N';
		}else if(num%23 == 13){
			return 'J';
		}else if(num%23 == 14){
			return 'Z';
		}else if(num%23 == 15){
			return 'S';
		}else if(num%23 == 16){
			return 'Q';
		}else if(num%23 == 17){
			return 'V';
		}else if(num%23 == 18){
			return 'H';
		}else if(num%23 == 19){
			return 'L';
		}else if(num%23 == 20){
			return 'C';
		}else if(num%23 == 21){
			return 'K';
		}else if(num%23 == 22){
			return 'E';
		}
		return 0;
		
	}
	
	public static boolean dni(String dni) {
		
		if(dni.length() == 9 || Character.isLetter((dni).charAt(8)) == true) {
			return true;
		}else {
			return false;
		}
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
