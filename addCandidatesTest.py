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
        # self.driver = webdriver.Chrome('chromedriver.exe')
        # self.driver = webdriver.Firefox(executable_path='geckodriver.exe')
        self.driver = webdriver.Edge(executable_path='msedgedriver.exe')
        self.base_url = 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'
        self.username = 'Admin'
        self.password = 'admin123'
        self.login_button="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"
        self.requirement_button="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"
        self.add_button="/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"
        self.save_button="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]"
    def login(self):
        self.driver.get(self.base_url)
        sleep(5)
        self.driver.find_element(By.NAME,"username").send_keys(self.username)
        self.driver.find_element(By.NAME,"password").send_keys(self.password)
        self.driver.find_element(By.XPATH,self.login_button).click()
        sleep(5)
    def navigate_requirement(self):
        self.driver.find_element(By.XPATH,self.requirement_button).click()
        sleep(5)
    def add_candidates(self,first_name, last_name, email):
        self.driver.find_element(By.XPATH,self.add_button).click()
        sleep(5)
        self.driver.find_element(By.NAME,"firstName").send_keys(first_name)
        self.driver.find_element(By.NAME,"lastName").send_keys(last_name)
        self.driver.find_element(By.XPATH,"/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input").send_keys(email)
        self.driver.find_element(By.XPATH,self.save_button).click()
        sleep(5)
    def read_testcase(self):
        data_list = []
        with open("TestCase.csv", newline='') as csvfile:
            reader = csv.DictReader(csvfile)
            for row in reader:
                data_list.append(row)
        return data_list
    def test_add_candidates(self):
        self.login()
        testdata_list=self.read_testcase()
        for testdata in testdata_list:
            self.navigate_requirement()
            self.add_candidates(testdata['firstName'], testdata['lastName'], testdata['email'])
            sleep(10)
    def tearDown(self):
        self.driver.quit()

if __name__ == "__main__":
    unittest.main()



