package qualifierexample.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bigggg")
public class BigLetterPrintServiceImp implements PrintService {

	public String showTheirName() {
		return "TOTO && POPO";
	}
	
}
