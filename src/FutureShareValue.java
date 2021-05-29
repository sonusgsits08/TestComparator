import java.util.ArrayList;
import java.util.List;

public class FutureShareValue {

	public static void main(String[] args) {
		double startingShareQty = 1;
		double startingSharePrice = 100;
		double futureSharePrice = 130;
		List<ShareDto> bonuses = new ArrayList();		
		System.out.println("Starting Qty:"+startingShareQty+" &Starting Value :"+startingShareQty*startingSharePrice);
		System.out.println("********************************");
		// 1:1 - bonus
		ShareDto dto1 = new ShareDto();
		dto1.setNumerator(1);
		dto1.setDenom(1);		
		bonuses.add(dto1);
		
		//3:1 - bonus
		ShareDto dto2 = new ShareDto();
		dto2.setNumerator(3);
		dto2.setDenom(1);	
		bonuses.add(dto2);
		
		// 2:1 -- splits
		ShareDto dto3 = new ShareDto();
		dto3.setNumerator(2);
		dto3.setDenom(1);
		dto3.setCorpAction("Split");
		bonuses.add(dto3);	
		
		FutureShareValue fsv = new FutureShareValue();
		double futureqty = fsv.calculateShareQty(bonuses,startingShareQty);		
		System.out.println("********************************");
		System.out.println("Future Qty"+futureqty+" & Future Value :"+futureqty*futureSharePrice);		
	}
	double calculateShareQty(List<ShareDto> list,double qty){				
		for (ShareDto shareDto : list) {
			if(!"Split".equalsIgnoreCase(shareDto.getCorpAction()))
			{
				// bonus case
				double denom = (double)shareDto.getDenom();
				double numer = (double)shareDto.getNumerator();
				qty = qty + qty * (numer/denom);			
				System.out.println("After Corp Action "+shareDto.getNumerator()+":"+shareDto.getDenom()+" Future Qty:"+qty);
			}
			else {
				//split case
				double denom = (double)shareDto.getDenom();
				double numer = (double)shareDto.getNumerator();
				qty = qty * (numer/denom);			
				System.out.println("After Corp Action "+shareDto.getNumerator()+":"+shareDto.getDenom()+" Future Qty:"+qty);
			}
		}
		
		return qty;
	}

}

