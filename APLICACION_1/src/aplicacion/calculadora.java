package aplicacion;

public class calculadora {
    
	double divicion;
	float multiplicacion;
	float resta;
	float suma;
	public calculadora (float x,float y){
		this.suma=x+y;
		this.resta=x-y;
		this.multiplicacion=x*y;
		this.divicion=x/y;
	}
	public float restacalcu(){
		return this.resta;
	}
	public float sumacalcula (){
		return this.suma;
	}
	public double divicalcula (){
		return this.divicion;
	}
	public float multicalcula(){
		return this.multiplicacion;
	}
}
