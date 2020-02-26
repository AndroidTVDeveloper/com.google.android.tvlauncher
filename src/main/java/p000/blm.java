package p000;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: blm */
/* compiled from: PG */
public final class blm {

    /* renamed from: a */
    public static final int f4293a = Build.VERSION.SDK_INT;

    /* renamed from: b */
    public static final String f4294b = Build.DEVICE;

    /* renamed from: c */
    public static final String f4295c = Build.MANUFACTURER;

    /* renamed from: d */
    public static final String f4296d;

    /* renamed from: e */
    public static final String f4297e;

    /* renamed from: f */
    public static final byte[] f4298f = new byte[0];

    /* renamed from: g */
    public static final Pattern f4299g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: h */
    private static final Pattern f4300h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: i */
    private static final Pattern f4301i = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: j */
    private static HashMap f4302j;

    /* renamed from: k */
    private static final String[] f4303k = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "slo", "sk", "wel", "cy"};

    /* renamed from: l */
    private static final int[] f4304l = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    static {
        String str = Build.MODEL;
        f4296d = str;
        String str2 = f4294b;
        String str3 = f4295c;
        int i = f4293a;
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        f4297e = sb.toString();
    }

    /* renamed from: a */
    public static Object m3636a(Object obj) {
        return obj;
    }

    /* renamed from: a */
    public static boolean m3648a(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: a */
    public static Object[] m3656a(Object[] objArr) {
        return objArr;
    }

    /* renamed from: b */
    public static int m3659b(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public static long m3662b(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: c */
    public static boolean m3672c(int i) {
        return i == 3 || i == 2 || i == Integer.MIN_VALUE || i == 1073741824 || i == 4;
    }

    /* renamed from: d */
    public static boolean m3676d(int i) {
        return i == Integer.MIN_VALUE || i == 1073741824;
    }

    /* renamed from: e */
    public static int m3677e(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f4293a;
                return (i2 >= 23 || i2 >= 21) ? 6396 : 0;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static boolean m3652a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        return obj2 == null;
    }

    /* renamed from: a */
    public static int m3629a(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            if (z) {
                binarySearch--;
            }
        } else {
            binarySearch ^= -1;
        }
        return z2 ? Math.min(jArr.length - 1, binarySearch) : binarySearch;
    }

    /* renamed from: a */
    public static int m3626a(List list, Comparable comparable, boolean z) {
        int i;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(comparable) == 0);
            i = binarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: a */
    public static int m3628a(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = binarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: a */
    public static int m3623a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: a */
    public static long m3631a(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    /* renamed from: a */
    public static void m3644a(bhv bhv) {
        if (bhv != null) {
            try {
                bhv.mo1503c();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static void m3645a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static float m3622a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: a */
    public static int m3624a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: a */
    public static long m3632a(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: a */
    public static boolean m3653a(Object[] objArr, Object obj) {
        for (Object a : objArr) {
            if (m3652a(a, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int m3627a(byte[] bArr, int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = f4304l[(i2 >>> 24) ^ (bArr[i3] & 255)] ^ (i2 << 8);
        }
        return i2;
    }

    /* renamed from: a */
    public static Handler m3634a(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: c */
    private static HashMap m3671c() {
        HashMap hashMap = new HashMap(f4303k.length + r2);
        int i = 0;
        for (String str : Locale.getISOLanguages()) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException e) {
            }
        }
        while (true) {
            String[] strArr = f4303k;
            if (i >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* renamed from: a */
    public static String m3638a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public static String m3640a(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    public static String m3641a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charset.forName("UTF-8"));
    }

    /* renamed from: g */
    public static byte[] m3680g(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: a */
    public static String m3637a(String str, int i) {
        if (r0 != 0) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : m3681h(str)) {
                if (i == bkt.m3521g(bkt.m3520f(str2))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str2);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m3666b(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = objArr.length;
            if (i >= length) {
                return sb.toString();
            }
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    /* renamed from: b */
    public static String m3664b(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return m3678e(networkCountryIso);
            }
        }
        return m3678e(Locale.getDefault().getCountry());
    }

    /* renamed from: a */
    public static Looper m3635a() {
        Looper myLooper = Looper.myLooper();
        return myLooper == null ? Looper.getMainLooper() : myLooper;
    }

    /* renamed from: a */
    public static long m3630a(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    /* renamed from: a */
    public static int m3625a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return 1;
                }
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                        return 3;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 4;
                    case 13:
                        return 5;
                    case 16:
                    default:
                        return 6;
                    case 18:
                        return 2;
                }
            } catch (SecurityException e) {
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static int m3660b(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i != 1073741824) {
            if (i == 2) {
                return i2 + i2;
            }
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i2 << 2;
    }

    /* renamed from: b */
    public static long m3661b(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    /* renamed from: a */
    public static String m3639a(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j2 = (j + 500) / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        sb.setLength(0);
        if (j5 > 0) {
            return formatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString();
        }
        return formatter.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    /* renamed from: b */
    public static String[] m3669b() {
        String[] strArr;
        String str;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f4293a < 24) {
            strArr = new String[1];
            Locale locale = configuration.locale;
            if (f4293a < 21) {
                str = locale.toString();
            } else {
                str = locale.toLanguageTag();
            }
            strArr[0] = str;
        } else {
            strArr = m3658a(configuration.getLocales().toLanguageTags(), ",");
        }
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = m3665b(strArr[i]);
        }
        return strArr;
    }

    /* renamed from: c */
    public static byte[] m3674c(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    public static boolean m3651a(bky bky, bky bky2, Inflater inflater) {
        if (bky.mo2070b() <= 0) {
            return false;
        }
        byte[] bArr = bky2.f4258a;
        if (bArr.length < bky.mo2070b()) {
            int b = bky.mo2070b();
            bArr = new byte[(b + b)];
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(bky.f4258a, bky.f4259b, bky.mo2070b());
        int i = 0;
        while (true) {
            try {
                int length = bArr.length;
                i += inflater.inflate(bArr, i, length - i);
                if (inflater.finished()) {
                    bky2.mo2068a(bArr, i);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i == length) {
                    bArr = Arrays.copyOf(bArr, length + length);
                }
            } catch (DataFormatException e) {
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return false;
    }

    /* renamed from: a */
    public static boolean m3649a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: c */
    public static boolean m3673c(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: a */
    public static ExecutorService m3642a(String str) {
        return Executors.newSingleThreadExecutor(new bll(str));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: b */
    public static String m3665b(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (f4293a >= 21) {
            replace = Locale.forLanguageTag(replace).toLanguageTag();
        }
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String d = m3675d(str);
        String str2 = m3670b(d, "-")[0];
        if (str2.length() != 3) {
            return d;
        }
        if (f4302j == null) {
            f4302j = m3671c();
        }
        String str3 = (String) f4302j.get(str2);
        if (str3 == null) {
            return d;
        }
        String valueOf = String.valueOf(d.substring(3));
        return valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf);
    }

    /* renamed from: b */
    public static Object[] m3668b(Object[] objArr, Object obj) {
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        return copyOf;
    }

    /* renamed from: a */
    public static Object[] m3657a(Object[] objArr, int i) {
        boolean z;
        if (i <= objArr.length) {
            z = true;
        } else {
            z = false;
        }
        bks.m3510a(z);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: b */
    public static Object[] m3667b(Object[] objArr, int i) {
        boolean z;
        bks.m3510a(true);
        if (i <= objArr.length) {
            z = true;
        } else {
            z = false;
        }
        bks.m3510a(z);
        return Arrays.copyOfRange(objArr, 1, i);
    }

    /* renamed from: f */
    public static long m3679f(String str) {
        Matcher matcher = f4300h.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw new ako(valueOf.length() == 0 ? new String("Invalid date/time format: ") : "Invalid date/time format: ".concat(valueOf));
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i = -i;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String valueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(valueOf2.length() == 0 ? new String("0.") : "0.".concat(valueOf2)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - ((long) (i * 60000)) : timeInMillis;
    }

    /* renamed from: a */
    public static boolean m3650a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public static void m3646a(List list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        } else if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* renamed from: a */
    public static long m3633a(long j, alb alb, long j2, long j3) {
        if (alb.f639a.equals(alb)) {
            return j;
        }
        long j4 = alb.f641c;
        long j5 = j - j4;
        if (((j4 ^ j) & (j ^ j5)) < 0) {
            j5 = Long.MIN_VALUE;
        }
        long b = m3662b(j, alb.f642d);
        boolean z = false;
        boolean z2 = j5 <= j2 && j2 <= b;
        if (j5 <= j3 && j3 <= b) {
            z = true;
        }
        if (z2 && z) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (!z2) {
            return z ? j3 : j5;
        }
        return j2;
    }

    /* renamed from: b */
    public static long m3663b(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        double d = (double) j;
        double d2 = (double) j2;
        double d3 = (double) j3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        Double.isNaN(d);
        return (long) (d * (d2 / d3));
    }

    /* renamed from: a */
    public static long[] m3655a(List list, long j) {
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i < size) {
                jArr[i] = ((Long) list.get(i)).longValue() / j2;
                i++;
            }
        } else if (j < 1000000 && 1000000 % j == 0) {
            long j3 = 1000000 / j;
            while (i < size) {
                jArr[i] = ((Long) list.get(i)).longValue() * j3;
                i++;
            }
        } else {
            double d = (double) j;
            Double.isNaN(d);
            double d2 = 1000000.0d / d;
            while (i < size) {
                double longValue = (double) ((Long) list.get(i)).longValue();
                Double.isNaN(longValue);
                jArr[i] = (long) (longValue * d2);
                i++;
            }
        }
        return jArr;
    }

    /* renamed from: a */
    public static void m3647a(long[] jArr, long j) {
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j2;
                i++;
            }
        } else if (j < 1000000 && 1000000 % j == 0) {
            long j3 = 1000000 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j3;
                i++;
            }
        } else {
            double d = (double) j;
            Double.isNaN(d);
            double d2 = 1000000.0d / d;
            while (i < jArr.length) {
                double d3 = (double) jArr[i];
                Double.isNaN(d3);
                jArr[i] = (long) (d3 * d2);
                i++;
            }
        }
    }

    /* renamed from: a */
    public static String[] m3658a(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: b */
    public static String[] m3670b(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: h */
    public static String[] m3681h(String str) {
        return !TextUtils.isEmpty(str) ? m3658a(str.trim(), "(\\s*,\\s*)") : new String[0];
    }

    /* renamed from: a */
    public static int[] m3654a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return iArr;
    }

    /* renamed from: d */
    public static String m3675d(String str) {
        if (str != null) {
            return str.toLowerCase(Locale.US);
        }
        return null;
    }

    /* renamed from: e */
    public static String m3678e(String str) {
        if (str != null) {
            return str.toUpperCase(Locale.US);
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* renamed from: i */
    public static String m3682i(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 + i2);
        StringBuilder sb = new StringBuilder(i4);
        Matcher matcher = f4301i.matcher(str);
        while (i2 > 0 && matcher.find()) {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            sb.append((CharSequence) str, i, matcher.start());
            sb.append((char) parseInt);
            i = matcher.end();
            i2--;
        }
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        if (sb.length() != i4) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m3643a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
