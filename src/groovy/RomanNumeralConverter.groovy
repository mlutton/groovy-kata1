
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

        if (remainingValue == 1)
            buffer = "I"
        else if (remainingValue == 2)
            buffer = "II"
        else buffer = "III"

        return buffer
    }}
