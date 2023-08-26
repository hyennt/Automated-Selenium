import unittest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from time import sleep
import csv

class OrangeHRMTest(unittest.TestCase):
    def setUp(self):
        # Replace 'path/to/your/webdriver' with the actual path of your WebDriver executable.
        self.driver = webdriver.Chrome('chromedriver.exe')
        # self.driver = webdriver.Firefox(executable_path='geckodriver.exe')
        # self.driver = webdriver.Edge(executable_path='msedgedriver.exe')
        self.base_url = 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'
        self.username = 'Admin'
        self.password = 'admin123'
        self.login_button="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"
        self.info_button="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span"
        self.emergency_button="/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a"
        self.addEmer_button="/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button"
        self.save_button="/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]"
    def login(self):
        self.driver.get(self.base_url)
        sleep(5)
        self.driver.find_element(By.NAME,"username").send_keys(self.username)
        self.driver.find_element(By.NAME,"password").send_keys(self.password)
        self.driver.find_element(By.XPATH,self.login_button).click()
        sleep(5)
    def navigate_emergency(self):
        self.driver.find_element(By.XPATH,self.info_button).click()
        sleep(3)
        self.driver.find_element(By.XPATH,self.emergency_button).click()
        sleep(3)
    def add_emergency(self,name,relationship,homeTelephone):
        self.driver.find_element(By.XPATH,self.addEmer_button).click()
        sleep(2)
        self.driver.find_element(By.XPATH,"/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input").send_keys(name)
        self.driver.find_element(By.XPATH,"/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input").send_keys(relationship)
        self.driver.find_element(By.XPATH,"/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input").send_keys(homeTelephone)
        self.driver.find_element(By.XPATH,self.save_button).click()
        sleep(5)
    def read_testcase(self):
        data_list = []
        with open("TestCaseEmer.csv", newline='') as csvfile:
            reader = csv.DictReader(csvfile)
            for row in reader:
                data_list.append(row)
        return data_list
    def test_add_emergency(self):
        self.login()
        testdata_list=self.read_testcase()
        for testdata in testdata_list:
            self.navigate_emergency()
            self.add_emergency(testdata['name'], testdata['relationship'], testdata['homeTelephone'])
            sleep(10)
    def tearDown(self):
        self.driver.quit()

if __name__ == "__main__":
    unittest.main()



