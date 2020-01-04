package qualifierexample.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smallll")
public class SmallLetterPrintServiceImp implements PrintService{

	public String showTheirName() {
		return "toto && popo";
	}

}
