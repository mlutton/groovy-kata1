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

    @Test public void WhenPassing2ThenResultIsII()
    {
        result = converter.GetValue(2)
        assert result == "II"
    }

    @Test public void WhenPassing3ThenResultIsIII()
    {
        result = converter.GetValue(3)
        assert result == "III"
    }

    @Test public void WhenPassing5ThenResultIsV()
    {
        result = converter.GetValue(5)
        assert result == "V"
    }

    @Test public void WhenPassing6ThenResultIsVI()
    {
        result = converter.GetValue(6)
        assert result == "VI"
    }
}
