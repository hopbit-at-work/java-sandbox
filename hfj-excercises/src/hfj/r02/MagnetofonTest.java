class MagnetofonTest{
	// nie skompiluje sie poniewaz 
	// obiekt m nie zostal zainicjalizowany
	public static void main(String[] args){
		m.mozeNagrywac = true;
		m.odtworzTasme();
		if(m.mozeNagrywac==true){
			m.nagrajTasme();
		}
	}
}
