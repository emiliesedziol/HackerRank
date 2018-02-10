import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class regularExpression {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println(s);

        String sToken = s.replace("_", " ");
        String[] ntokens = sToken.split("\\W");
        

        int countTokens = 0;
        for (String y:ntokens) {
        	if (!(y.isEmpty())) {
        		countTokens += 1;
        	}
        }
        System.out.println(countTokens);
        for (String x:ntokens) {
        	if (!(x.isEmpty())) {
        		System.out.println(x);
        	}
        }


	}

}
/*
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, 
split the string into tokens. We define a token to be one or more 
consecutive English alphabetic letters. Then, print the number of tokens, 
followed by each token on a new line.

He is a very very good boy, isn't he?

10
He
is
a
very
very
good
boy
isn
t
he

s is composed of any of the following: English alphabetic letters, 
blank spaces, exclamation points (!), commas (,), question marks (?), 
periods (.), underscores (_), apostrophes ('), and at symbols (@).

On the first line, print an integer, , denoting the number of tokens in string  
(they do not need to be unique). Next, print each of the  tokens on a new 
line in the same order as they appear in input string .

 

*/