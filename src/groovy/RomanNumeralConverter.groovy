
/**
 * Created with IntelliJ IDEA.
 * User: mlutton
 * Date: 12/4/12
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
class RomanNumeralConverter {
    public String[] romanNumerals = ["X", "IX", "V", "IV", "I"]
    public int[] numberList = [10,9,5,4,1]

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
