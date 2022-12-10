What is your line of code for #1?
shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

What is your line of code for #2?
driver.findElement(By.name("q")).sendKeys("internet speed test" + Keys.RETURN);

What is your line of code for #3?
shortWait.until(ExpectedConditions.elementToBeClickable(By.id("knowledge-verticals-internetspeedtest__test_button")));

What is your line of code for #4?
driver.findElement(By.id("knowledge-verticals-internetspeedtest__test_button")).click();

What is your line of code for #5?
shortWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//g-raised-button[@jsaction=\'dArJMd\']")));

What is your line of code for #6?
longWait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(By.xpath("//g-raised-button[@jsaction=\'dArJMd\']"))));

What is your line of code for #7?
shortWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//g-raised-button[@jsaction=\'i0JLwd\']")));

What is your line of code for #8?
shortWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//g-raised-button[@jsaction=\'iyDKIb\']")));

What is your line of code for #9?
driver.findElement(By.name("q")).sendKeys("internet speed test" + Keys.RETURN);

What is your line of code for #10?
driver.findElement(By.id("knowledge-verticals-internetspeedtest__test_button")).click();

What is your line of code for #11?
cancelButton = driver.findElement(By.cssSelector("g-raised-button[jsaction=\'dArJMd\']"));

What is your line of code for #12?


What is your line of code for #13?
testAgainButton = driver.findElement(By.cssSelector("g-raised-button[jsaction=\'iyDKIb\']"));

What is your line of code for #14?
shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

What is your line of code for #15?
driver.findElement(By.name("q")).sendKeys("calculator" + Keys.RETURN);

What is your line of code for #16?
shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\'tyYmIf\']")));

What is your line of code for #17?
driver.findElement(By.xpath("//div[@jsname=\'N10B9\']")).click();

What is your line of code for #18?
driver.findElement(By.xpath("//div[@jsname=\'XSr6wc\']")).click();

What is your line of code for #19?
driver.findElement(By.xpath("//div[@jsname=\'pPHzQc\']")).click();

What is your line of code for #20?

What is your line of code for #21?
driver.findElement(By.xpath("//div[@jsname=\'Pt8tGc\']")).click();

What is your line of code for #22?
driver.findElement(By.xpath("//div[@jsname=\'SLn8gc\']")).click();

What is your line of code for #23?
driver.findElement(By.xpath("//div[@jsname=\'T7PMFe\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "8")); } catch (TimeoutException ex) { fail("\"8\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'rk7bOd\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "87")); } catch (TimeoutException ex) { fail("\"7\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'XSr6wc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "87 +")); } catch (TimeoutException ex) { fail("\"+\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'Ax5wH\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "87 + 5")); } catch (TimeoutException ex) { fail("\"5\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'lVjWed\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "87 + 52")); } catch (TimeoutException ex) { fail("\"2\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'Pt8tGc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "139")); } catch (TimeoutException ex) { fail("\"139\" was not the solution."); } driver.findElement(By.xpath("//div[@jsname=\'SLn8gc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0")); } catch (TimeoutException ex) { fail("Output not cleared to \"0\"."); } try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { // TODO Auto-generated catch block e.printStackTrace(); }

What is your line of code for #24?
driver.findElement(By.xpath("//div[@jsname=\'abcgof\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "6")); } catch (TimeoutException ex) { fail("\"6\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'KN1kY\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "63")); } catch (TimeoutException ex) { fail("\"3\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'YovRWb\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "63 ×")); } catch (TimeoutException ex) { fail("\"×\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'lVjWed\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "63 × 2")); } catch (TimeoutException ex) { fail("\"2\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'N10B9\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "63 × 21")); } catch (TimeoutException ex) { fail("\"1\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'Pt8tGc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "1323")); } catch (TimeoutException ex) { fail("\"1323\" was not the solution."); } driver.findElement(By.xpath("//div[@jsname=\'SLn8gc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0")); } catch (TimeoutException ex) { fail("Output not cleared to \"0\"."); } try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { // TODO Auto-generated catch block e.printStackTrace(); }

What is your line of code for #25?
driver.findElement(By.xpath("//div[@jsname=\'xAP7E\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "4")); } catch (TimeoutException ex) { fail("\"4\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'Ax5wH\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "45")); } catch (TimeoutException ex) { fail("\"5\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'WxTTNd\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "45 ÷")); } catch (TimeoutException ex) { fail("\"÷\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'XoxYJ\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "45 ÷ 9")); } catch (TimeoutException ex) { fail("\"9\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'Pt8tGc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "5")); } catch (TimeoutException ex) { fail("\"5\" was not the solution."); } driver.findElement(By.xpath("//div[@jsname=\'SLn8gc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0")); } catch (TimeoutException ex) { fail("Output not cleared to \"0\"."); } try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { // TODO Auto-generated catch block e.printStackTrace(); }

What is your line of code for #26?
driver.findElement(By.xpath("//div[@jsname=\'rk7bOd\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "7")); } catch (TimeoutException ex) { fail("\"7\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'lVjWed\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "72")); } catch (TimeoutException ex) { fail("\"2\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'WxTTNd\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "72 ÷")); } catch (TimeoutException ex) { fail("\"÷\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'N10B9\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "72 ÷ 1")); } catch (TimeoutException ex) { fail("\"1\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'bkEvMb\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "72 ÷ 10")); } catch (TimeoutException ex) { fail("\"0\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'Pt8tGc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "7.2")); } catch (TimeoutException ex) { fail("\"7.2\" was not the solution."); } driver.findElement(By.xpath("//div[@jsname=\'SLn8gc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0")); } catch (TimeoutException ex) { fail("Output not cleared to \"0\"."); } try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { // TODO Auto-generated catch block e.printStackTrace(); }

What is your line of code for #27?
driver.findElement(By.xpath("//div[@jsname=\'DfiOAc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(")); } catch (TimeoutException ex) { fail("\"log\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'Ax5wH\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(5")); } catch (TimeoutException ex) { fail("\"5\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'T7PMFe\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58")); } catch (TimeoutException ex) { fail("\"8\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'YovRWb\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 ×")); } catch (TimeoutException ex) { fail("\"×\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'abcgof\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 × 6")); } catch (TimeoutException ex) { fail("\"6\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'WxTTNd\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 × 6 ÷")); } catch (TimeoutException ex) { fail("\"÷\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'lVjWed\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 × 6 ÷ 2")); } catch (TimeoutException ex) { fail("\"2\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'pPHzQc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 × 6 ÷ 2 -")); } catch (TimeoutException ex) { fail("\"-\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'rk7bOd\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 × 6 ÷ 2 - 7")); } catch (TimeoutException ex) { fail("\"7\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'xAP7E\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "log(58 × 6 ÷ 2 - 74")); } catch (TimeoutException ex) { fail("\"4\" was not input."); } driver.findElement(By.xpath("//div[@jsname=\'Pt8tGc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "2")); } catch (TimeoutException ex) { fail("\"2\" was not the solution."); } driver.findElement(By.xpath("//div[@jsname=\'SLn8gc\']")).click(); try { shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0")); } catch (TimeoutException ex) { fail("Output not cleared to \"0\"."); } try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { // TODO Auto-generated catch block e.printStackTrace(); } }

What is your line of code for #28?
driver.findElement(By.name("q")).sendKeys("calculator" + Keys.RETURN);

What is your line of code for #29?
driver.findElement(By.cssSelector("div.tyYmIf"));

What is your line of code for #30?
driver.findElement(By.cssSelector("div[jsname=\'N10B9\']")).click();

What is your line of code for #31?
driver.findElement(By.cssSelector("div[jsname=\'XSr6wc\']")).click();

What is your line of code for #32?
driver.findElement(By.cssSelector("div[jsname=\'pPHzQc\']")).click();

What is your line of code for #33?
driver.findElement(By.cssSelector("div[jsname=\'lVjWed\']")).click();

What is your line of code for #34?
driver.findElement(By.cssSelector("div[jsname=\'Pt8tGc\']")).click();

What is your line of code for #35?
driver.findElement(By.cssSelector("div[jsname=\'SLn8gc\']")).click();

What is your line of code for #36?
driver.findElement(By.cssSelector("div[jsname=\'T7PMFe\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'8\']")); } catch (NoSuchElementException ex) { fail("\"8\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'rk7bOd\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'87\']")); } catch (NoSuchElementException ex) { fail("\"7\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'XSr6wc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'87 + \']")); } catch (NoSuchElementException ex) { fail("\"+\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'Ax5wH\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'87 + 5\']")); } catch (NoSuchElementException ex) { fail("\"5\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'lVjWed\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'87 + 52\']")); } catch (NoSuchElementException ex) { fail("\"2\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'Pt8tGc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'139\']")); } catch (NoSuchElementException ex) { fail("\"139\" was not the solution."); } driver.findElement(By.cssSelector("div[jsname=\'SLn8gc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'0\']")); } catch (NoSuchElementException ex) { fail("Output not cleared to \"0\"."); } try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { // TODO Auto-generated catch block e.printStackTrace(); }

What is your line of code for #37?
driver.findElement(By.cssSelector("div[jsname=\'abcgof\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'6\']")); } catch (NoSuchElementException ex) { fail("\"6\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'KN1kY\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'63\']")); } catch (NoSuchElementException ex) { fail("\"3\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'YovRWb\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'63 × \']")); } catch (NoSuchElementException ex) { fail("\"×\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'lVjWed\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'63 × 2\']")); } catch (NoSuchElementException ex) { fail("\"2\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'N10B9\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'63 × 21\']")); } catch (NoSuchElementException ex) { fail("\"1\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'Pt8tGc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'1323\']")); } catch (NoSuchElementException ex) { fail("\"1323\" was not the solution."); } driver.findElement(By.cssSelector("div[jsname=\'SLn8gc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'0\']")); } catch (NoSuchElementException ex) { fail("Output not cleared to \"0\"."); }

What is your line of code for #38?
driver.findElement(By.cssSelector("div[jsname=\'xAP7E\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'4\']")); } catch (NoSuchElementException ex) { fail("\"4\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'Ax5wH\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'45\']")); } catch (NoSuchElementException ex) { fail("\"5\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'WxTTNd\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'45 ÷ \']")); } catch (NoSuchElementException ex) { fail("\"÷\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'XoxYJ\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'45 ÷ 9\']")); } catch (NoSuchElementException ex) { fail("\"9\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'Pt8tGc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'5\']")); } catch (NoSuchElementException ex) { fail("\"5\" was not the solution."); } driver.findElement(By.cssSelector("div[jsname=\'SLn8gc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'0\']")); } catch (NoSuchElementException ex) { fail("Output not cleared to \"0\"."); } try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { // TODO Auto-generated catch block e.printStackTrace(); }

What is your line of code for #39?
driver.findElement(By.cssSelector("div[jsname=\'rk7bOd\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'7\']")); } catch (NoSuchElementException ex) { fail("\"7\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'lVjWed\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'72\']")); } catch (NoSuchElementException ex) { fail("\"2\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'WxTTNd\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'72 ÷ \']")); } catch (NoSuchElementException ex) { fail("\"÷\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'N10B9\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'72 ÷ 1\']")); } catch (NoSuchElementException ex) { fail("\"1\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'bkEvMb\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'72 ÷ 10\']")); } catch (NoSuchElementException ex) { fail("\"0\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'Pt8tGc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'7.2\']")); } catch (NoSuchElementException ex) { fail("\"7.2\" was not the solution."); } driver.findElement(By.cssSelector("div[jsname=\'SLn8gc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'0\']")); } catch (NoSuchElementException ex) { fail("Output not cleared to \"0\"."); } try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { // TODO Auto-generated catch block e.printStackTrace(); }

What is your line of code for #40?
driver.findElement(By.cssSelector("div[jsname=\'DfiOAc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'log(\']")); } catch (NoSuchElementException ex) { fail("\"log\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'Ax5wH\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'log(5\']")); } catch (NoSuchElementException ex) { fail("\"5\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'T7PMFe\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'log(58\']")); } catch (NoSuchElementException ex) { fail("\"8\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'YovRWb\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'log(58 × \']")); } catch (NoSuchElementException ex) { fail("\"×\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'abcgof\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'log(58 × 6\']")); } catch (NoSuchElementException ex) { fail("\"6\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'WxTTNd\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'log(58 × 6 ÷ \']")); } catch (NoSuchElementException ex) { fail("\"÷\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'lVjWed\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'log(58 × 6 ÷ 2\']")); } catch (NoSuchElementException ex) { fail("\"2\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'pPHzQc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'log(58 × 6 ÷ 2 - \']")); } catch (NoSuchElementException ex) { fail("\"-\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'rk7bOd\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'log(58 × 6 ÷ 2 - 7\']")); } catch (NoSuchElementException ex) { fail("\"7\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'xAP7E\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'log(58 × 6 ÷ 2 - 74\']")); } catch (NoSuchElementException ex) { fail("\"4\" was not input."); } driver.findElement(By.cssSelector("div[jsname=\'Pt8tGc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'2\']")); } catch (NoSuchElementException ex) { fail("\"2\" was not the solution."); } driver.findElement(By.cssSelector("div[jsname=\'SLn8gc\']")).click(); try { driver.findElement(By.xpath("//span[@id=\'cwos\' and text()=\'0\']")); } catch (NoSuchElementException ex) { fail("Output not cleared to \"0\"."); } try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { // TODO Auto-generated catch block e.printStackTrace(); }


