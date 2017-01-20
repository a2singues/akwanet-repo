package fr.akwanet.java.optimized.heritage;

public class MainAnimal {

	public static void main(String[] args) {
		Animal anim = new Animal();
		
		Chien anim1 = new Chien();
		anim1.manger();
		anim1.crier();
		anim1.opChien();
		System.out.println("----------------------------------");
		
		Animal anim2 = new Vache();
		anim2.manger();
		anim2.crier();
		
		anim = anim1;
//		anim1 = anim;
		
		Mere m = new Mere();
		Fille f = new Fille();
		m = f;
//		f = m;
		Mere mf = f;
//		Fille fm = m;

        Mere mere =  new Mere() ;    
        Fille fille =  new Fille() ;  
        Mere filleMere = fille ;  //---Valide car fille hérite de Mere
        
        System.out.println("mere.ouSuisJe ? "+mere.ouSuisJe()) ;  
        System.out.println("fille.ouSuisJe ?"+fille.ouSuisJe()) ;  
        System.out.println("filleMere.ouSuisJe ? "+filleMere.ouSuisJe());
        
	}

}
