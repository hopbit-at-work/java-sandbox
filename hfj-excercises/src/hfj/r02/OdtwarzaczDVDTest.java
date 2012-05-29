package hfj.r02;
class OdtwarzaczDVDTest {
	public static void main(String[] args){
		OdtwarzaczDVD o = new OdtwarzaczDVD();
		o.mozeNagrywac = true;
		o.odtworzPlyte(); // blad kompilacji - brak takiej metody w klasie OdtwarzaczDVD
		if(o.mozeNagrywac==true){
			o.nagrajPlyte();
		}
	}
}
