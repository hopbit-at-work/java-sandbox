package hfj.r02;
class PerkusjaTester{
	public static void main(String[] args){
		Perkusja p = new Perkusja();
		p.zagrajNaBebnie();
		p.beben=false;
		if(p.beben==true){
			p.zagrajNaBebnie();
		}
		p.zagrajNaTalerzach();
	}
}
