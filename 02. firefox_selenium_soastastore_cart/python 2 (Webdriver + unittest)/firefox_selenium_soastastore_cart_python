# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re

class SoastastoreTest(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(30)
        self.base_url = "https://www.katalon.com/"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_soastastore(self):
        driver = self.driver
        driver.get("http://www.soastastore.com/")
        driver.find_element_by_link_text("Store").click()
        driver.find_element_by_id("product_111_submit_button").click()
        driver.find_element_by_id("product_112_submit_button").click()
        driver.find_element_by_id("product_116_submit_button").click()
        driver.find_element_by_id("product_117_submit_button").click()
        driver.find_element_by_id("product_118_submit_button").click()
        driver.find_element_by_id("product_119_submit_button").click()
        driver.find_element_by_id("product_155_submit_button").click()
        driver.find_element_by_xpath("(//select[@name='product_rating'])[7]").click()
        Select(driver.find_element_by_xpath("(//select[@name='product_rating'])[7]")).select_by_visible_text("4")
        driver.find_element_by_xpath("(//option[@value='4'])[7]").click()
        driver.find_element_by_id("product_156_submit_button").click()
        driver.find_element_by_id("product_157_submit_button").click()
        driver.find_element_by_id("product_158_submit_button").click()
        driver.find_element_by_id("product_159_submit_button").click()
        driver.find_element_by_id("product_160_submit_button").click()
        driver.find_element_by_id("product_161_submit_button").click()
        driver.find_element_by_id("product_162_submit_button").click()
        driver.find_element_by_id("product_163_submit_button").click()
        driver.find_element_by_id("product_164_submit_button").click()
        driver.find_element_by_id("product_165_submit_button").click()
        driver.find_element_by_id("product_166_submit_button").click()
        driver.find_element_by_xpath("(//a[contains(text(),'Checkout')])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_xpath("(//input[@name='submit'])[2]").click()
        driver.find_element_by_link_text("Home").click()
        driver.close()
    
    def is_element_present(self, how, what):
        try: self.driver.find_element(by=how, value=what)
        except NoSuchElementException as e: return False
        return True
    
    def is_alert_present(self):
        try: self.driver.switch_to_alert()
        except NoAlertPresentException as e: return False
        return True
    
    def close_alert_and_get_its_text(self):
        try:
            alert = self.driver.switch_to_alert()
            alert_text = alert.text
            if self.accept_next_alert:
                alert.accept()
            else:
                alert.dismiss()
            return alert_text
        finally: self.accept_next_alert = True
    
    def tearDown(self):
        self.driver.quit()
        self.assertEqual([], self.verificationErrors)

if __name__ == "__main__":
    unittest.main()
