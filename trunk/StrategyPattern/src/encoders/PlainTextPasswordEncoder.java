package encoders;

public class PlainTextPasswordEncoder implements IPasswordEncoder {

	@Override
	public String encode(String password) {
		return "(PLT)" + password;
	}

}
