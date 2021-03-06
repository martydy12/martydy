package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helpers.Base;

public class Page_MyInfo extends Base {
	public Page_MyInfo() {
		PageFactory.initElements(webDriver, this);
	}

	// ################################################## Page Objects
	// ##################################################
	@FindBy(xpath = "(//select[contains(@id,'LIFEEVENTTYPEID')])[1]")
	private WebElement dropdown_InfoType;
	@FindBy(xpath = "(//label[text()='Info Type'])[1]")
	private WebElement label_InfoType;
	@FindBy(xpath = "//input[@value='Add Info']")
	private WebElement button_AddInfo;
	@FindBy(xpath = "//div[contains(@id,'Title')]//span[contains(text(),'Wellness Check')]")
	private WebElement tab_WellnessCheck;
	@FindBy(xpath = "//div[contains(@id,'Title')]//div[contains(text(),'Timeline')]")
	private WebElement tab_Timeline;
	@FindBy(xpath = "//input[@value='Start Wellness Check']")
	private WebElement button_StartWellnessCheck;
	@FindBy(xpath = "//span[text()='How has your work or leisure life been?']")
	private WebElement label_WellnessCheckQuestion1;
	@FindBy(xpath = "//span[text()='Edited question one']")
	private WebElement label_WellnessCheckQuestion1Updated;
	@FindBy(xpath = "//span[text()='How have you been coping with your continence?']")
	private WebElement label_WellnessCheckQuestion2;
	@FindBy(xpath = "//span[text()='How has your mood been?']")
	private WebElement label_WellnessCheckQuestion3;
	@FindBy(xpath = "//span[text()='How has your relationship with your partner been?']")
	private WebElement label_WellnessCheckQuestion4;
	@FindBy(xpath = "//span[text()='How have you been coping with your sexual function?']")
	private WebElement label_WellnessCheckQuestion5;
	@FindBy(xpath = "//span[text()='My Info']//following::div//span[text()='Wellness Check']")
	private WebElement getWellnessCheckTabOnMyInfoPage;
	@FindBy(xpath = "(//span[text()='My Info']//following::div//span[text()='PSA'])[1]")
	private WebElement getPSATabOnMyInfoPage;

	@FindBy(xpath = "//img[contains(@src,'data:image/jpg;base64,iVBOR')]")
	private WebElement image_Logo;

	// Links - Footer
	@FindBy(xpath = "//img[contains(@src,'data:image/jpg;base64,iVBOR')]")
	private WebElement link_AboutUs;
	@FindBy(xpath = "//a[contains(text(),'Copyright and Disclaimer')]")
	private WebElement link_CopyRightAndDisclaimer;
	@FindBy(xpath = "//a[contains(text(),'Privacy')]")
	private WebElement link_Privacy;
	@FindBy(xpath = "//a[contains(text(),'Terms and Condition')]")
	private WebElement link_TermsAndCondition;
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	private WebElement link_ContactUs;
	@FindBy(xpath = "//a[contains(text(),'DB Results')]")
	private WebElement link_DBResults;

	@FindBy(xpath = "//span[text()='I want more information about my condition']")
	private WebElement button_Reason1;
	@FindBy(xpath = "//span[text()='I want to speak about treatment side effects']")
	private WebElement button_Reason2;
	@FindBy(xpath = "//span[text()='I want to speak about my mood and relationships']")
	private WebElement button_Reason3;
	@FindBy(xpath = "//span[text()='I am not sure']")
	private WebElement button_Reason4;
	@FindBy(xpath = "(//input[@value='Begin Health Assessment'])[1]")
	private WebElement button_StartAssessmentTOP;

	@FindBy(xpath = "//div[text()='Assessments']")
	private WebElement menubar_Assessment;

	@FindBy(xpath = "//div[text()='Appointments']")
	private WebElement menubar_Appointments;
	@FindBy(xpath = "//input[@value='Request Appointment']")
	private WebElement button_RequestAppointment;
	@FindBy(xpath = "//span[text()='What would you like to talk about?']")
	private WebElement label_SelectReason;

	@FindBy(xpath = "//div[text()='Anxiety']")
	private WebElement progressBar_Anxiety;
	@FindBy(xpath = "(//div[text()='1'])[1]")
	private WebElement progressBar_1;
	@FindBy(xpath = "//input[@value='Anxiety']")
	private WebElement checkbox_Anxiety;

	@FindBy(xpath = "//span[contains(text(),'Anxiety')]")
	private WebElement label_AnxietyResults;
	@FindBy(xpath = "//span[contains(text(),'Physical Activity')]")
	private WebElement label_PhysicalActivityResults;
	@FindBy(xpath = "//span[text()='Assessment Results']")
	private WebElement label_AssessmentResults;
	@FindBy(xpath = "(//div[text()='1'])[1]/following::div[text()='Needs']")
	private WebElement label_FirstPageNeeds;
	@FindBy(xpath = "(//div[text()='2'])[1]/following::div[text()='Depression']")
	private WebElement label_SecondPageDepression;
	@FindBy(xpath = "(//div[text()='3'])[1]/following::div[text()='Anxiety']")
	private WebElement label_ThirdPageAnxiety;
	@FindBy(xpath = "(//div[text()='4'])[1]/following::div[text()='Physical Activity']")
	private WebElement label_FourthPagePhysicalActivity;
	@FindBy(xpath = "(//div[text()='Physical Activity'])[1]")
	private WebElement label_PhysicalActivityQuestions;
	@FindBy(xpath = "//div[text()='Patients']")
	private WebElement label_DoctorPatientTab;
	@FindBy(xpath = "//div[text()='Assessments']")
	private WebElement menubar_Assessments;
	@FindBy(xpath = "//div[@id='psagraphcontainer']")
	private WebElement graph_HealthIndicator;
	@FindBy(xpath = "//div[contains(text(),'demeth camuin')]")
	private WebElement label_ProfileName;
	@FindBy(xpath = "//a[contains(text(),'Profile')]//span[@class='fa fa-fw fa-wrench']")
	private WebElement link_ProfileName;
	@FindBy(xpath = "//span[text()='Basic Information']")
	private WebElement label_BasicInformation;
	@FindBy(xpath = "//input[contains(@id,'Patient_MEDICARENUMBER')]")
	private WebElement field_MedicareNumber;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement button_Save;
	@FindBy(xpath = "//input[@value='Next']")
	private WebElement button_Next;
	@FindBy(xpath = "//span[text()='Medicare No. must be 10 digits']")
	private WebElement error_MedicareNumber;

	//Start: DHP - 57
	@FindBy(xpath = "(//select[contains(@id,'LifeEvent_LIFEEVENTTYPEID')])[1]//option[text()='Treatment']")
	private WebElement option_Treatment;
	@FindBy(xpath = "//select[contains(@id,'LifeEvent_LIFEEVENTSUBTYPEID')]")
	private WebElement dropdown_TreatmentType;
	@FindBy(xpath = "//select[contains(@id,'LifeEvent_LIFEEVENTSUBTYPEID')]//option[text()='Active Surveillance']")
	private WebElement option_TreatmentType1;
	@FindBy(xpath = "//select[contains(@id,'LifeEvent_LIFEEVENTSUBTYPEID')]//option[text()='Brachytherapy']")
	private WebElement option_TreatmentType2;
	@FindBy(xpath = "//select[contains(@id,'LifeEvent_LIFEEVENTSUBTYPEID')]//option[text()='Chemotherapy']")
	private WebElement option_TreatmentType3;
	@FindBy(xpath = "//select[contains(@id,'LifeEvent_LIFEEVENTSUBTYPEID')]//option[text()='Hormone Theraphy']")
	private WebElement option_TreatmentType4;
	@FindBy(xpath = "//select[contains(@id,'LifeEvent_LIFEEVENTSUBTYPEID')]//option[text()='Insulin Pump']")
	private WebElement option_TreatmentType5;
	@FindBy(xpath = "//select[contains(@id,'LifeEvent_LIFEEVENTSUBTYPEID')]//option[text()='Natural Theraphy']")
	private WebElement option_TreatmentType6;
//End: DHP - 57

//Start: DHP - 99
	@FindBy(xpath = "//select[contains(@id,'LifeEvent_LIFEEVENTSUBTYPEID')]//option[text()='Brain Surgeon']")
	private WebElement option_AppointmentType1;
	@FindBy(xpath = "//select[contains(@id,'LifeEvent_LIFEEVENTSUBTYPEID')]//option[text()='Dental']")
	private WebElement option_AppointmentType2;
	@FindBy(xpath = "//select[contains(@id,'LifeEvent_LIFEEVENTSUBTYPEID')]//option[text()='Dietitian']")
	private WebElement option_AppointmentType3;
//End: DHP - 99

//Start: DHP - 110
	@FindBy(xpath = "(//div[@class='ph'])[2]")
	private WebElement dropdown_UserName;
	@FindBy(xpath = "//a[@href='/DBHOrchestration/Profile.aspx']")
	private WebElement option_Profile;
	@FindBy(xpath = "(//a[@href='/DBHPatientUI/ProfileMedicalInfo.aspx'])[2]")
	private WebElement link_MedicalInfo;
	@FindBy(xpath = "//label[contains(@for,'PatientDemographics_GPPHONE')]")
	private WebElement label_GPPhone;
	@FindBy(xpath = "//select[contains(@id,'PatientDemographics_SPECIALTY')]")
	private WebElement dropdown_MedicalInfoSpeciality;
	@FindBy(xpath = "//select[contains(@id,'PatientDemographics_SPECIALTY')]//option[text()='Cardiologist']")
	private WebElement option_PMISpeciality1;
	@FindBy(xpath = "//select[contains(@id,'PatientDemographics_SPECIALTY')]//option[text()='Endocrinologist']")
	private WebElement option_PMISpeciality2;
	@FindBy(xpath = "//select[contains(@id,'PatientDemographics_SPECIALTY')]//option[text()='Medical Oncologist']")
	private WebElement option_PMISpeciality3;
	@FindBy(xpath = "//select[contains(@id,'PatientDemographics_SPECIALTY')]//option[text()='Neurologist']")
	private WebElement option_PMISpeciality4;
	@FindBy(xpath = "//select[contains(@id,'PatientDemographics_SPECIALTY')]//option[text()='Radiation Oncologist']")
	private WebElement option_PMISpeciality5;
//End: DHP - 110
	
	//Start: DHP - 182
		@FindBy(xpath = "//label[contains(@for,'LifeEvent_LIFEEVENTSUBTYPEID') and text()='Treatment Type']")
		private WebElement label_TreatmentType;
		//End: DHP - 182
	
	
	// ################################################## Return Page Objects
	// ##################################################
	
	public WebElement getMedicardNumberError() {
		return error_MedicareNumber;
	}

	public WebElement getSaveButton() {
		return button_Save;
	}

	public WebElement getNextButton() {
		return button_Next;
	}

	public WebElement getMedicareNumberField() {
		return field_MedicareNumber;
	}

	public WebElement getBasicInformationlabel() {
		return label_BasicInformation;
	}

	public WebElement getProfileNamelink() {
		return link_ProfileName;
	}

	public WebElement getProfileNamelabel() {
		return label_ProfileName;
	}

	public WebElement getPSAGraphContainer() {
		return graph_HealthIndicator;
	}

	public WebElement getPSATabOnMyInfoPage() {
		return getPSATabOnMyInfoPage;
	}

	public WebElement getDoctorPatientTab() {
		return label_DoctorPatientTab;
	}

	public WebElement getWellnessCheckTabOnMyInfoPage() {
		return getWellnessCheckTabOnMyInfoPage;
	}

	public WebElement getWellnessCheckQuestion1() {
		return label_WellnessCheckQuestion1;
	}

	public WebElement getWellnessCheckQuestion1Updated() {
		return label_WellnessCheckQuestion1Updated;
	}

	public WebElement getWellnessCheckQuestion2() {
		return label_WellnessCheckQuestion2;
	}

	public WebElement getWellnessCheckQuestion3() {
		return label_WellnessCheckQuestion3;
	}

	public WebElement getWellnessCheckQuestion4() {
		return label_WellnessCheckQuestion4;
	}

	public WebElement getWellnessCheckQuestion5() {
		return label_WellnessCheckQuestion4;
	}

	public WebElement getStartWellnessCheckbutton() {
		return button_StartWellnessCheck;
	}

	public WebElement getTimelineTab() {
		return tab_Timeline;
	}

	public WebElement getWellnessCheckTab() {
		return tab_WellnessCheck;
	}

	public WebElement getLabelInfoType() {
		return label_InfoType;
	}

	public WebElement getButtonAddInfo() {
		return button_AddInfo;
	}

	public WebElement getDropdownInfoType() {
		return dropdown_InfoType;
	}

	public WebElement getImageLogo() {
		return image_Logo;
	}

	public WebElement getLinkContactUs() {
		return link_ContactUs;
	}

	public WebElement getButtonReason1() {
		return button_Reason1;
	}

	public WebElement getStartAssessmentTOPButton() {
		return button_StartAssessmentTOP;
	}

	public WebElement getButtonReason2() {
		return button_Reason2;
	}

	public WebElement getButtonReason3() {
		return button_Reason3;
	}

	public WebElement getButtonReason4() {
		return button_Reason4;
	}

	public WebElement getAssessmentMenubar() {
		return menubar_Assessment;
	}

	public WebElement getSelectReasonQuestion() {
		return label_SelectReason;
	}

	public WebElement getPhysicalActivityResultsLabel() {
		return label_PhysicalActivityResults;
	}

	public WebElement getAnxietyResultsLabel() {
		return label_AnxietyResults;
	}

	public WebElement getPhysicalActivityQuestionsLabel() {
		return label_PhysicalActivityQuestions;
	}

	public WebElement getFirstPageNeeds() {
		return label_FirstPageNeeds;
	}

	public WebElement getFourthPagePhysicalActivity() {
		return label_FourthPagePhysicalActivity;
	}

	public WebElement getThirdPageAnxiety() {
		return label_ThirdPageAnxiety;
	}

	public WebElement getSecondPageDepression() {
		return label_SecondPageDepression;
	}

	public WebElement getAssessmentResultsLabel() {
		return label_AssessmentResults;
	}

	public WebElement getAnxietyProgressBar() {
		return progressBar_Anxiety;
	}

	public WebElement getAnxietyCheckbox() {
		return checkbox_Anxiety;
	}

	public WebElement getProgressBar1() {
		return progressBar_1;
	}

	public WebElement getRequestAppointmentButton() {
		return button_RequestAppointment;
	}

	public WebElement getAppointmentsMenubar() {
		return menubar_Appointments;
	}

	public WebElement getMenubarAssessments() {
		return menubar_Assessments;
	}
	
	//Start: DHP - 57
		public WebElement getOptionTreatment() {
			return option_Treatment;
		}
		public WebElement getDropdownTreatmentType() {
			return dropdown_TreatmentType;
		}
		public WebElement getTreatmentOption1() {
			return option_TreatmentType1;
		}
		public WebElement getTreatmentOption2() {
			return option_TreatmentType2;
		}
		public WebElement getTreatmentOption3() {
			return option_TreatmentType3;
		}
		//End: DHP - 57
		//Start: DHP - 99
		public WebElement getAppointmentOption1() {
				return option_AppointmentType1;
			}
		public WebElement getAppointmentOption2() {
				return option_AppointmentType2;
			}
		public WebElement getAppointmentOption3() {
				return option_AppointmentType3;
			}
		//End: DHP - 99
		//Start: DHP - 100
		public WebElement getTreatmentOption4() {
			return option_TreatmentType4;
		}
		public WebElement getTreatmentOption5() {
			return option_TreatmentType5;
		}
		public WebElement getTreatmentOption6() {
			return option_TreatmentType6;
		}
		//End: DHP - 100
		//Start: DHP - 110
		public WebElement getUserNameDropdown() {
			return dropdown_UserName;
		}
		public WebElement getOptionProfile() {
			return option_Profile;
		}
		public WebElement getLinkMedicalInfo() {
			return link_MedicalInfo;
		}
		public WebElement getLabelGPPhone() {
			return label_GPPhone;
		}
		public WebElement getMedicalnfoSpecialityDropdown() {
			return dropdown_MedicalInfoSpeciality;
		}
		public WebElement getPMIOption1() {
			return option_PMISpeciality1;
		}
		public WebElement getPMIOption2() {
			return option_PMISpeciality2;
		}
		public WebElement getPMIOption3() {
			return option_PMISpeciality3;
		}
		public WebElement getPMIOption4() {
			return option_PMISpeciality4;
		}
		public WebElement getPMIOption5() {
			return option_PMISpeciality5;
		}
		//End: DHP - 110
		//Start: DHP - 182
		public WebElement getlabelTreatmentType() {
			return label_TreatmentType;
		}
		//End: DHP - 182

}
