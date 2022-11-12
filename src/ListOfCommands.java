import java.lang.*;
public class ListOfCommands
{


        public static void main (String[] args)
        {
            //Change any values in array for test
            int arr[] = {5, 58, -8, 5, 45, 1};

            int first_element, second_element, arr_size = arr.length;

            /* Return if the array size less than two */
            if (arr_size < 2)
            {
                System.out.println("Array size less than two.");
                return;
            }

            first_element = second_element = Integer.MIN_VALUE;
            for (int i = 0; i < arr_size ; i ++)
            {
                /* Update both first and second if current element is Bigger than first. */
                if (arr[i] > first_element)
                {
                    second_element = first_element;
                    first_element = arr[i];
                }

            /* Update second if arr[i] is between first and second
               elements.*/
                else if (arr[i] > second_element && arr[i] != first_element)
                    second_element = arr[i];
            }
            if (second_element == Integer.MIN_VALUE)
                System.out.println("No second largest element.");
            else
                System.out.println("The largest element is " +
                        first_element + " and second largest  element is " + second_element +".");

        }
    }
//Change the MIN_VALUE to MAX_VALUE and > to < for Smallest elements.
