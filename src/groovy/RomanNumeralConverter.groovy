
/**
 * Created with IntelliJ IDEA.
 * User: mlutton
 * Date: 12/4/12
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
class RomanNumeralConverter {
    public String[] romanNumerals = ["V", "I"]
    public int[] numberList = [5,1]

    public String GetValue (int value) {

        def buffer = ""
        def remainingValue = value

        for(int i = 0; i < romanNumerals.length; i++)
        {
            def nextNumberToTry = numberList[i]

            while (remainingValue >= nextNumberToTry)
            {
                buffer = buffer + romanNumerals[i]
                remainingValue = remainingValue - nextNumberToTry
            }
        }

        return buffer
    }}
