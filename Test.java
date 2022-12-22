package Live;
import Music.String.Veena;
import Music.Wind.Saxaphone;
import Music.Playble;
class Test
{
	public static void main(String args[])
	{
		Veena V=new Veena();
		V.play();
		Saxaphone S=new Saxaphone();
		S.play();
		Playble p;
		p=V;
		p.play();
		p=S;
		p.play();
	}
}