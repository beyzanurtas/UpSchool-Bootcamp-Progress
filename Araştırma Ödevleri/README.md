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


## <a name="4"></a> Araştırma Ödevi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız.

    
   






