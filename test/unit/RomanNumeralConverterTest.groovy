import org.junit.Test
/**
 * Created with IntelliJ IDEA.
 * User: mlutton
 * Date: 12/4/12
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
class RomanNumeralConverterTest extends GroovyTestCase {

    RomanNumeralConverter converter
    String result

    void setUp() {
        converter = new RomanNumeralConverter()
    }

    void tearDown() {

    }

    @Test public void WhenPassing1ThenResultIsI()
    {
        result = converter.GetValue(1)
        assert result == "I"
    }

}
