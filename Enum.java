class Enum{
	public enum enumEnum{
		DAYS(24);
		
		private final int days;
		private enumEnum(int days){
			this.days = days;
		}
		public int getValue(){
			return this.days;
		}
	}
	public static void main(String[] args){
		enumEnum A = enumEnum.DAYS;
		System.out.println(A.getValue());
	}
}
