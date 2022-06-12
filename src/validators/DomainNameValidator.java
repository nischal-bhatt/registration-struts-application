package validators;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class DomainNameValidator extends FieldValidatorSupport {

	private String domainName;

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	@Override
	public void validate(Object object) throws ValidationException {

		System.out.println("domain name validator in action");
		
		String fieldName = getFieldName();
		String email = (String) getFieldValue(fieldName, object);

		if (!email.endsWith(domainName)) {
			addFieldError(fieldName, object);
		}

	}

}
