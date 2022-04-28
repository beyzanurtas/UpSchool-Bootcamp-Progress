# Araştırma Ödevleri:

- [Araştırma Ödevi 1 - Lateinit](#1)
- [Araştırma Ödevi 2 - Tools Namespace](#2)
- [Araştırma Ödevi 3 - Font family XML](#3)
- [Araştırma Ödevi 4 - Property Animation](#4)


### <a name="1"></a> Araştırma Ödevi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?
Lateinit geç başlatma (late initialization) anlamına gelir. Constructor’da bir değişken başlatmak istemiyorsak, onu daha sonra başlatmak istiyorsak ve kullanmadan önce başlatmayı garanti edebiliyorsak bu değişkeni lateinit anahtar kelimesi ile tanımlayabiliriz. Bu sayede değişken başlatılana kadar bellekte yer kaplamaz. Değer ataması daha sonra yapılacağı için val değil var ile birlikte kullanılabilir. Ayrıca lateinit ile kullanılan değişkenler non-null bir değişkendir. 

*Örnek Kullanım:*

        private lateinit var usernameEditText: EditText
        private lateinit var passwordEditText: EditText

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        usernameEditText = view.findViewById(R.id.username_edit_text)
        passwordEditText = view.findViewById(R.id.password_edit_text)   
        }
### <a name="2"></a> Araştırma Ödevi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 
Android Studio, tools namespace’de tasarım-zaman özelliklerini (bir fragmentte hangi layout’un gösterileceği gibi) veya derleme-zaman davranışlarını (XML kaynaklarınıza hangi küçültme modunun uygulanacağı gibi) etkinleştiren çeşitli XML attribute’larını destekler. Uygulamanızı oluşturduğunuzda, derleme araçları bu attribute’ları kaldırır, böylece APK boyutunuz veya çalışma zamanı davranışınız üzerinde hiçbir etkisi olmaz. Bu attribute’ları kullanmak için, burada gösterildiği gibi, araçları kullanmak istediğiniz her XML dosyasının kök öğesine tools namespace eklenir ([Kaynak](https://developer.android.com/studio/write/tool-attributes#toolslayout)):
       
       <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
       xmlns:tools="http://schemas.android.com/tools"/>
       
*Örnek bir Tools Attribute Kullanımı:*

    <NumberPicker xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/numberPicker"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    tools:minValue="0"
    tools:maxValue="10"/>
    
## <a name="3"></a> Araştırma Ödevi 3

- Font family dosyasını nasıl oluşturup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

 ✔ Font family dosyası oluşturmak için sırasıyla font > New > Font Resource File adımlarını izleriz ve dosyayı isimlendirdikten sonra bir font resource XML'in açıldığını görürüz. 



<img src="https://github.com/beyzanurtas/UpSchool-Bootcamp-Progress/blob/main/Ara%C5%9Ft%C4%B1rma%20%C3%96devleri/Pictures/font%20resource%20file.png" align="left" width="400" height="400"/>


<img src="https://github.com/beyzanurtas/UpSchool-Bootcamp-Progress/blob/main/Ara%C5%9Ft%C4%B1rma%20%C3%96devleri/Pictures/new%20resource%20file.PNG" align="right" 
     width="570" height="400" />   
     
&nbsp;
&nbsp;

Açılan XML'de *font* dosyasında bulunan bir fontu seçerek style, weight gibi özelliklerini tanımlarız.   

      <?xml version="1.0" encoding="utf-8"?>
      <font-family xmlns:android="http://schemas.android.com/apk/res/android">
        <font
          android:fontStyle="normal"
          android:font="@font/manofik_regular"
          android:fontWeight="400" />
        <font
          android:fontStyle="italic"
          android:font="@font/manofik_italic"
          android:fontWeight="400" />
     </font-family>
     
 
 Oluşturduğumuz fontun örnek kullanımı ise 
 
<table>
<tr>
<td> acitivty_main.xml </td> <td> Phone View </td>
</tr>
<tr>
<td> 
        
        
        <TextView
        android:id="@+id/Title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="@font/manofik_italic"
        android:text="Hello World!"
        android:textColor="@color/purple_700"
        android:textSize="50sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.496"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.29" />

        <TextView
        android:id="@+id/Text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="88dp"
        android:text="@string/font_family_project"
        android:fontFamily="@font/manofik_regular"
        android:textSize="30sp"
        android:textColor="@color/purple_200"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/Title" /> </td>
<td>    
       
<img src="https://github.com/beyzanurtas/UpSchool-Bootcamp-Progress/blob/main/Ara%C5%9Ft%C4%B1rma%20%C3%96devleri/Pictures/phone_view.PNG" align="right" />
        
</td>
</tr>
</table>

&nbsp;
&nbsp;
      
 ✔ Google fontlarını veya internet üzerinden bulduğumuz diğer fontları *font* dosyasına kaydetmemizin sebebi kullandığımız fontun projemizde devamlılığını sağlayabilmek içindir. Yani, örneğin Google fontu kullanımdan kaldırabilir ve projemizde bu fontu artık kullanamayabiliriz. Bunun önüne geçmiş oluyoruz. 
 Font family kullanarak da style, weight gibi özellikler tanımlayarak da fontumuzu kişiselleştirmiş gibi oluyoruz([Kaynak](https://developer.android.com/guide/topics/ui/look-and-feel/fonts-in-xml)).

## <a name="4"></a> Araştırma Ödevi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız.

### Syntax:
       
      <set
      android:ordering=["together" | "sequentially"]>

      <objectAnimator
        android:propertyName="string"
        android:duration="int"
        android:valueFrom="float | int | color"
        android:valueTo="float | int | color"
        android:startOffset="int"
        android:repeatCount="int"
        android:repeatMode=["restart" | "reverse"]
        android:valueType=["intType" | "floatType"]/>

      <animator
        android:duration="int"
        android:valueFrom="float | int | color"
        android:valueTo="float | int | color"
        android:startOffset="int"
        android:repeatCount="int"
        android:repeatMode=["restart" | "reverse"]
        android:valueType=["intType" | "floatType"]/>

       <set>
        ...
       </set>
      </set>     

<code>animator:</code> Belirli bir süre boyunca bir animasyon gerçekleştirir. *ValueAnimator*'ı temsil eder.

<code>objectAnimator:</code> Belirli bir süre boyunca bir nesnenin belirli bir özelliğini canlandırır. *ObjectAnimator*'ı temsil eder. ValueAnimator'ın alt sınıfıdır. Syntax bölümünde de gördüğümüz gibi animator'dan farklı olarak propertyName tanımlaması yaparız. Canlandırılacak nesnenin özelliğini *string* ifade olarak belirtiriz. Örneğin, bir View nesnesi için "alpha" veya "backgroundColor" belirtebiliriz([Kaynak](https://developer.android.com/guide/topics/resources/animation-resource#Property)). 
   






