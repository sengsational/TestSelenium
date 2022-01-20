# TestSelenium

This is a mostly empty Android Studio project, the purpose of which, 
is to figure out how to get Selenium-based functionality to run
in an Android application.  

The purpose of this repo is to collect details surrounding the problem.

Using "org.seleniumhq.selenium:selenium-htmlunit-driver:2.52.0" results in
a library mismatch problem (https://stackoverflow.com/questions/69523686/android-studio-how-can-i-fill-in-a-html-form-and-click-the-submit-button-with-se).

Using "net.sourceforge.htmlunit:htmlunit-android:2.56.0-SNAPSHOT" results in 
an overlapping library problem (https://github.com/HtmlUnit/htmlunit/issues/133#issuecomment-1008189635)
in the area of org.apache.commons.codec.net.URLCodec.

