package MyTests;

public class cssSelector {

	public static void main(String[] args) {

		// cssSelector rules
		// 1. id => htmltag#id , #id
		// 2. class => htmltag.classname, .classname, .c1.c2.c3
		// 3. parent>childtag
		// 4. htmltag[id='value']
		// 4.a. input[id='username'][type='email'] --css with two properties
		// 5. contains in css:
		// input[id*='user']
		// input[id*='name']
		// input[id*test_]
		// 6. start the text in css:
		// input[id^='user']
		// 7. ending the text in css:
		// input[id$='name']
		// 8. comma in css
		// div.private-form_input-wrapper, input#username
		// 9. first-of-type in css:
		// ul#categories>li:first-of-type
		// 10. first-of-type in css:
		// ul#categories>li:last-of-type
		// 11. nth-of-type
		// ul#categories>li:nth-of-type(2)
		// ul#categories>li:nth-of-type(n)
		// 12. sibling of element:
		// div.private-form_input-wrapper + div
		//13. not operator in css:
		//input.from-control.private-form_control:not(.login-password)

	}

}
