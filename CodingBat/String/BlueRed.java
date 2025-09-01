class BlueRed{
	public String seeColor(String str) {
  int l = str.length();
  String r = str.substring(0,4);
  String b = str.substring(0,5);
  if(l>=3){
     if(r.equals("red")){
       return "red";
    }else if(b.equals("blue")){
       return "blue";
    }
  }
  return "";
  
}
	public static void main(String[] args) {
    BlueRed b1  = new BlueRed();
    b1.seeColor("redmarket");
   
}
}