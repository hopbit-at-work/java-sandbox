package hfj.r02;
class OdtwarzaczDVDTest {
	public static void main(String[] args){
		OdtwarzaczDVD o = new OdtwarzaczDVD();
		o.mozeNagrywac = true;
		o.odtworzPlyte(); // teraz powinno juz banglac tak jak trzeba
		if(o.mozeNagrywac==true){
			o.nagrajPlyteDVD();
		}
	}
}
