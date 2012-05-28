package hfj.r02;
class MagnetofonTest{
	// teraz powinno juz dzialac ok
	public static void main(String[] args){
		Magnetofon m = new Magnetofon();
		m.mozeNagrywac = true;
		m.odtworzTasme();
		if(m.mozeNagrywac==true){
			m.nagrajTasme();
		}
	}
}
