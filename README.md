
# SQA-Project-2024

- นายบดินทร์ แสนสุข รหัสนักศึกษา 653380135-9 section 1

- นายกีรติ ดุภะสกุล รหัสนักศึกษา 653380263-0 section 1

  

Repository นี้เป็นรายงานโปรเจคฉบับสมบูรณ์

  

### 1. Design Pattern

- Prototype pattern

- Singleton pattern

  

### 2. ภาษา (Programming language)

- Python
- Java

### 3. Unit testing

- Pytest
- JUnit
- Branch coverage 100%
  

### 4. Prompt

จากข้อ 1 – 3 ทำให้สามารถเขียน prompt ได้ 4 prompts ดังนี้

#### **Python**

#### 1 
"Use the prototype pattern to generate code in Python from the requirements below.
	1. Generate Pytest to test the code that you given code that have 100% branch coverage.
	2. Use AAA method for write code."
##### 2 
"Use the singleton pattern to generate code in Python from the requirements below.
	1. Generate Pytest to test the code that you given code that have 100% branch coverage.
	2. Use AAA method for write code."

#### **Java**

#### 1 
"Use the prototype pattern to generate code in Java from the requirements below.
	1. Generate JUnit to test the code that you given code that have 100% branch coverage.
	2. Use AAA method for write code."
##### 2 
"Use the singleton pattern to generate code in Java from the requirements below.
	1. Generate JUnit to test the code that you given code that have 100% branch coverage.
	2. Use AAA method for write code."

### 5. เครื่องมือที่ใช้
    1.  Pytest เพื่อทดสอบ Branch coverage ของโค้ดภาษาไพธอน
    2.  JUnit เพื่อทดสอบโค้ดภาษาจาวา
    3.  Jacoco เพื่อทดสอบ Branch coverage และรายงานผล ของโค้ดภาษาจาวา
    4.  SonarQube เพื่อวัดประสิทธิภาพของโค้ดตาม Code metrices ต่างๆ
    5.  Visual Studio Code ใช้สำหรับการเขียนโค้ดต่างๆ


### 6. Generative AI และประสิทธิภาพของโค้ด
    เกณฑ์ประเมิน a คือ โค้ดที่สร้างขึ้นถูกต้องตามข้อกําหนดที่ระบุไว้หรือไม่
    เกณฑ์ประเมิน b คือ โค้ดที่ถูกสร้างขึ้นใช้ภาษาโปรแกรมและ Design pattern ที่ระบุไว้หรือไม่
    เกณฑ์ประเมิน c คือ โค้ดที่สร้างขึ้นสามารถ run ได้ทันทีหรือไม่?
    เกณฑ์ประเมิน d คือ Test code ที่ถูกสร้างขึ้นสามารถรันได้โดยไม่มีerror หรือไม่ ?

#### **Python** 
แบ่งเป็น Prototype Pattern 3 รอบ และ Singleton Pattern 3 รอบ
1. ChatGPT 3.5 Free 
- เกณฑ์ประเมิน a ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน b ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน c ถูกต้อง 6 รอบ
- เกณฑ์ประเมิน d ถูกต้อง 6 รอบ 
- Branch Coverage เฉลี่ย = 97.17 %
2. Gemini 1.5 Flash
- เกณฑ์ประเมิน a ถูกต้อง 6 รอบ 
- เกณฑ์ประเมิน b ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน c ถูกต้อง 4 รอบ ไม่ถูกต้อง 2 รอบ แก้ไขได้ง่าย เพียงแค่ ลบบรรทัด และ Syntax Error
- เกณฑ์ประเมิน d ถูกต้อง 6 รอบ 
- Branch Coverage เฉลี่ย = 99.17 %
3. Gemini 1.5 Pro
- เกณฑ์ประเมิน a ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน b ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน c ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ แก้ไขได้ง่าย แก้ไขอาร์กิวเมนต์ที่ส่งให้ตรงกับ Constructor
- เกณฑ์ประเมิน d ถูกต้อง 6 รอบ 
- Branch Coverage เฉลี่ย = 91.67 %
4. GitHub Copilot (Education – Student version)
- เกณฑ์ประเมิน a ถูกต้อง 6 รอบ 
- เกณฑ์ประเมิน b ถูกต้อง 6 รอบ 
- เกณฑ์ประเมิน c ถูกต้อง 6 รอบ 
- เกณฑ์ประเมิน d ถูกต้อง 6 รอบ 
- Branch Coverage เฉลี่ย = 89.67 %

#### **Java**
แบ่งเป็น Prototype Pattern 3 รอบ และ Singleton Pattern 3 รอบ
1. ChatGPT 3.5 Free
- เกณฑ์ประเมิน a ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน b ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน c ถูกต้อง 6 รอบ  Constructor
- เกณฑ์ประเมิน d ถูกต้อง 3 รอบ ไม่ถูกต้อง 3 รอบ
- Branch Coverage เฉลี่ย = 60.00 % , Prototype Pattern รอบ 2 และ 3 มีค่าเป็น n/a
2. Gemini 1.5 Flash
- เกณฑ์ประเมิน a ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน b ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน c ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ แก้ไขได้ง่าย โดยการ import ให้ถูกต้อง
- เกณฑ์ประเมิน d ถูกต้อง 3 รอบ ไม่ถูกต้อง 3 รอบ
- Branch Coverage เฉลี่ย = 25.00 % , Prototype Pattern ทุกรอบ มีค่าเป็น n/a และ Singleton Pattern รอบ 2 มีค่าเป็น n/a
3. Gemini 1.5 Pro
- เกณฑ์ประเมิน a ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน b ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน c ถูกต้อง 6 รอบ  
- เกณฑ์ประเมิน d ถูกต้อง 3 รอบ ไม่ถูกต้อง 3 รอบ 
- Branch Coverage เฉลี่ย = 29.17 %, Prototype Pattern รอบ 1 และ 2 มีค่าเป็น n/a และ Singleton Pattern รอบ 2 แลั 3 มีค่าเป็น n/a
4. GitHub Copilot (Education – Student version)
- เกณฑ์ประเมิน a ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน b ถูกต้อง 5 รอบ ไม่ถูกต้อง 1 รอบ
- เกณฑ์ประเมิน c ถูกต้อง 6 รอบ 
- เกณฑ์ประเมิน d ถูกต้อง 3 รอบ ไม่ถูกต้อง 3 รอบ
- Branch Coverage เฉลี่ย = 50.00 %, Prototype Pattern ทุกรอบมีค่าเป็น n/a

**หมายเหตุ** ไฟล์ Test ของ Prototype Pattern ภาษา Java ทั้งหมด ในทุก Generative AI มีปัญหาเดียวกัน คือ Build mvn failed แก้ไขยากเพราะต้องสร้าง mvn โปรเจค และย้ายไฟล์ พร้อมทั้ง import ให้ถูกต้อง

### 7. สรุปผลการทดสอบ
#### **Python** 
จากการทดสอบโดย SonarQube นั้นได้ผลลัพธ์ ในส่วนของ Security, Reliability, Maintainability, Hotspots Reviewed ทั้งหมดอยู่ในระดับ A แสดงว่าโค้ดทั้งหมดมีความปลอดภัย และสามารถอัปเดตได้ง่าย แต่ Gemini 1.5 Pro ทั้งของ prototype pattern และ singleton pattern พบปัญหาในเมทริกซ์ Maintainability เล็กน้อยแต่ยังอยู่ในระดับ A และ GitHub Copilot (Education – Student version) ส่วนของ singleton pattern พบปัญหาในเมทริกซ์ Maintainability เล็กน้อย แต่ยังอยู่ในระดับ A

**ดังนั้น Generative AI ทุกตัวสามารถสร้างโค้ดได้ตรงตาม Design Pattern และมีประสิทธิภาพที่ยอมรับได้ อีกทั้งโค้ดยังมีประสิทธิภาพที่ดี**
#### **Java** 
จากการทดสอบโดย SonarQube นั้นได้ผลลัพธ์ ในส่วนของ 
Security ระดับ E พบช่องโหว่จากไฟล์ pom.xml, Reliability ระดับ E พบ 3 ปัญหา ได้แก่ 2 ปัญหาจากโค้ดโปรแกรมของ Gemini 1.5 Flash 2 ปัญหา และ 1 ปัญหา จาก โค้ดโปรแกรมของ Gemini 1.5 Pro, Maintainability ระดับ B พบ 226 ปัญหา ซึ่ง ChatGPT 3.5 Free พบปัญหามากที่สุด 72 ปัญหา และ Gemini 1.5 Flash พบปัญหาน้อยที่สุด 41 ปัญหา, Hotspots Reviewed อยู่ในระดับ E มีเพียง GitHub Copilot ที่อยู่ในระดับ A แสดงว่าโค้ดที่ได้จาก GitHub Copilot  มีความปลอดภัยที่สุด GitHub Copilot และ Gemini 1.5 Flash มีการซ้ำกันของโค้ดโปรแกรมที่ 11.00% แต่ GitHub Copilot มีค่า Cognitive Complexity = 3 ซึ่งน้อยที่สุด เมื่อเทียบกับ ChatGPT 3.5 Free, Gemini 1.5 Flash และ Gemini 1.5 Pro ที่ 9, 9, และ 8 ตามลำดับ แสดงว่า GitHub Copilot สามารถสร้างโค้ดที่เข้าใจได้ง่ายมากที่สุด 

**ดังนั้น Generative AI ทุกตัวสร้างโค้ดที่ไม่น่าพอใจทั้งในส่วนของความถูกต้องจากผลการทดสอบจาก Jacoco นั้นต่ำ และเมื่อนำมาวัดคุณภาพโค้ดโดย SonarQube นั้นยังพบช่องโหว่ในทุกๆ Generative AI มีเพียง GitHub Copilot ที่สามารถสร้างโค้ดที่ไม่มีช่องโหว่ด้านความปลอดภัยคือไม่มีเมทริกซ์ตัวใดอยู่ในระดับ E แต่ยังพบปัญหาในด้านอื่นๆ เช่นความซ้ำซ้อนของโค้ด (Duplications)**