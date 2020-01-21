#Author: giovannig.gomez@sqasa.com

Feature: Sign in to the web page
				 of Tigo where the data will be contain
				 in a file csv

  Scenario: User is logged into web page with data from file csv
    Given User will get data from csv
    And User will save data in a model 
    When User will enter his credentials
    Then User will be in homepage TIGO
