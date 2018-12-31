package Ejercicio;
public class persona {
      private String name;
      private  String friends;
      private int numfriends;
      public persona(){
    	  name=null;
    	  friends=null;
    	  numfriends=0;
      }
      public persona(String name, String friends){
    	  this.name=name;
    	  this.friends=friends;  
      }
      public String toMostrar(){
    	 return name+" || "+friends;
      }
      public void addfriends(persona v){
    	 name=name+v.name;
    	 friends=friends+v.friends;
      }
      public void unfriends (persona nonfriend){
    	  friends=friends.replace(nonfriend.name+"", " ");
      }
      // get || set 
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public String getFriends() {
		return friends;
	}
	public void setFriends(String friends) {
		this.friends = friends;
	}
	public int getNumfriends() {
		return numfriends;
	}
	public void setNumfriends(int numfriends) {
		this.numfriends = numfriends;
	}     
}
