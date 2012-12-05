
/**
 * Created with IntelliJ IDEA.
 * User: mlutton
 * Date: 12/4/12
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
class RomanNumeralConverter {
    public String GetValue (int value) {

        def buffer = ""
        def remainingValue = value

        while (remainingValue > 0)
        {
            buffer = buffer + "I"
            remainingValue = remainingValue - 1
        }

        return buffer
    }}
