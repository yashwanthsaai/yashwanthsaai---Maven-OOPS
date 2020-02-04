package demo1;

public class Gift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TotalWeight = 0;
		String[] gift = {"DairyMilk","Snickers","Five_star","Munch","Perk","KitKat"} ;
		String chocolate = new String();

		for(int i=0;i<gift.length; i++){
			chocolate = gift[i];

			switch (chocolate)
			{

				case "DairyMilk":
					DairyMilk d = new DairyMilk();
					TotalWeight += d.weight() ; 
					break;

				case "Five_star":
					Five_star f = new Five_star(); 
					TotalWeight += f.weight();
					break;

				case "Snickers" :
					Snickers s = new Snickers();
					TotalWeight += s.weight();
					break;

				case "Munch"	:
					Munch m = new Munch();
					TotalWeight += m.weight();
					break;

				case "KitKat"   :
					KitKat k = new KitKat();
					TotalWeight += k.weight();
					break;

				case "Perk"     :
					Perk p = new Perk();
					TotalWeight += p.weight();
					break;
			}

		}
		System.out.println(TotalWeight);
	}

}
