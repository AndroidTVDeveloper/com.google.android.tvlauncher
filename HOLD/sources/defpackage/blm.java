package defpackage;

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

/* renamed from: blm  reason: default package */
/* compiled from: PG */
public final class blm {
    public static final int a = Build.VERSION.SDK_INT;
    public static final String b = Build.DEVICE;
    public static final String c = Build.MANUFACTURER;
    public static final String d;
    public static final String e;
    public static final byte[] f = new byte[0];
    public static final Pattern g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    private static final Pattern h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    private static final Pattern i = Pattern.compile("%([A-Fa-f0-9]{2})");
    private static HashMap j;
    private static final String[] k = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "slo", "sk", "wel", "cy"};
    private static final int[] l = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    static {
        String str = Build.MODEL;
        d = str;
        String str2 = b;
        String str3 = c;
        int i2 = a;
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(str).length() + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        e = sb.toString();
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static boolean a(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static Object[] a(Object[] objArr) {
        return objArr;
    }

    public static int b(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static long b(long j2, long j3) {
        long j4 = j2 + j3;
        if (((j2 ^ j4) & (j3 ^ j4)) < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static boolean c(int i2) {
        return i2 == 3 || i2 == 2 || i2 == Integer.MIN_VALUE || i2 == 1073741824 || i2 == 4;
    }

    public static boolean d(int i2) {
        return i2 == Integer.MIN_VALUE || i2 == 1073741824;
    }

    public static int e(int i2) {
        switch (i2) {
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
                int i3 = a;
                return (i3 >= 23 || i3 >= 21) ? 6396 : 0;
            default:
                return 0;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        return obj2 == null;
    }

    public static int a(long[] jArr, long j2, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch >= 0) {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            if (z) {
                binarySearch--;
            }
        } else {
            binarySearch ^= -1;
        }
        return z2 ? Math.min(jArr.length - 1, binarySearch) : binarySearch;
    }

    public static int a(List list, Comparable comparable, boolean z) {
        int i2;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(comparable) == 0);
            i2 = binarySearch + 1;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static int a(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = binarySearch + 1;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static int a(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static long a(long j2, long j3) {
        return ((j2 + j3) - 1) / j3;
    }

    public static void a(bhv bhv) {
        if (bhv != null) {
            try {
                bhv.c();
            } catch (IOException e2) {
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
            }
        }
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int a(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long a(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean a(Object[] objArr, Object obj) {
        for (Object a2 : objArr) {
            if (a(a2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int a(byte[] bArr, int i2) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = l[(i3 >>> 24) ^ (bArr[i4] & 255)] ^ (i3 << 8);
        }
        return i3;
    }

    public static Handler a(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    private static HashMap c() {
        HashMap hashMap = new HashMap(k.length + r2);
        int i2 = 0;
        for (String str : Locale.getISOLanguages()) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException e2) {
            }
        }
        while (true) {
            String[] strArr = k;
            if (i2 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String a(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    public static String a(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, Charset.forName("UTF-8"));
    }

    public static byte[] g(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 + i2;
            bArr[i2] = (byte) ((Character.digit(str.charAt(i3), 16) << 4) + Character.digit(str.charAt(i3 + 1), 16));
        }
        return bArr;
    }

    public static String a(String str, int i2) {
        if (r0 != 0) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : h(str)) {
                if (i2 == bkt.g(bkt.f(str2))) {
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

    public static String b(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int length = objArr.length;
            if (i2 >= length) {
                return sb.toString();
            }
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }

    public static String b(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return e(networkCountryIso);
            }
        }
        return e(Locale.getDefault().getCountry());
    }

    public static Looper a() {
        Looper myLooper = Looper.myLooper();
        return myLooper == null ? Looper.getMainLooper() : myLooper;
    }

    public static long a(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = (double) j2;
        double d3 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 * d3);
    }

    public static int a(Context context) {
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
            } catch (SecurityException e2) {
            }
        }
        return 0;
    }

    public static int b(int i2, int i3) {
        if (i2 == Integer.MIN_VALUE) {
            return i3 * 3;
        }
        if (i2 != 1073741824) {
            if (i2 == 2) {
                return i3 + i3;
            }
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i3 << 2;
    }

    public static long b(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = (double) j2;
        double d3 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    public static String a(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        long j3 = (j2 + 500) / 1000;
        long j4 = j3 % 60;
        long j5 = (j3 / 60) % 60;
        long j6 = j3 / 3600;
        sb.setLength(0);
        if (j6 > 0) {
            return formatter.format("%d:%02d:%02d", Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4)).toString();
        }
        return formatter.format("%02d:%02d", Long.valueOf(j5), Long.valueOf(j4)).toString();
    }

    public static String[] b() {
        String[] strArr;
        String str;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (a < 24) {
            strArr = new String[1];
            Locale locale = configuration.locale;
            if (a < 21) {
                str = locale.toString();
            } else {
                str = locale.toLanguageTag();
            }
            strArr[0] = str;
        } else {
            strArr = a(configuration.getLocales().toLanguageTags(), ",");
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = b(strArr[i2]);
        }
        return strArr;
    }

    public static byte[] c(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    public static boolean a(bky bky, bky bky2, Inflater inflater) {
        if (bky.b() <= 0) {
            return false;
        }
        byte[] bArr = bky2.a;
        if (bArr.length < bky.b()) {
            int b2 = bky.b();
            bArr = new byte[(b2 + b2)];
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(bky.a, bky.b, bky.b());
        int i2 = 0;
        while (true) {
            try {
                int length = bArr.length;
                i2 += inflater.inflate(bArr, i2, length - i2);
                if (inflater.finished()) {
                    bky2.a(bArr, i2);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i2 == length) {
                    bArr = Arrays.copyOf(bArr, length + length);
                }
            } catch (DataFormatException e2) {
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return false;
    }

    public static boolean a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static boolean c(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static ExecutorService a(String str) {
        return Executors.newSingleThreadExecutor(new bll(str));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (a >= 21) {
            replace = Locale.forLanguageTag(replace).toLanguageTag();
        }
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String d2 = d(str);
        String str2 = b(d2, "-")[0];
        if (str2.length() != 3) {
            return d2;
        }
        if (j == null) {
            j = c();
        }
        String str3 = (String) j.get(str2);
        if (str3 == null) {
            return d2;
        }
        String valueOf = String.valueOf(d2.substring(3));
        return valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf);
    }

    public static Object[] b(Object[] objArr, Object obj) {
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        return copyOf;
    }

    public static Object[] a(Object[] objArr, int i2) {
        boolean z;
        if (i2 <= objArr.length) {
            z = true;
        } else {
            z = false;
        }
        bks.a(z);
        return Arrays.copyOf(objArr, i2);
    }

    public static Object[] b(Object[] objArr, int i2) {
        boolean z;
        bks.a(true);
        if (i2 <= objArr.length) {
            z = true;
        } else {
            z = false;
        }
        bks.a(z);
        return Arrays.copyOfRange(objArr, 1, i2);
    }

    public static long f(String str) {
        Matcher matcher = h.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw new ako(valueOf.length() == 0 ? new String("Invalid date/time format: ") : "Invalid date/time format: ".concat(valueOf));
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i2 = -i2;
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
        return i2 != 0 ? timeInMillis - ((long) (i2 * 60000)) : timeInMillis;
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void a(List list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        } else if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static long a(long j2, alb alb, long j3, long j4) {
        if (alb.a.equals(alb)) {
            return j2;
        }
        long j5 = alb.c;
        long j6 = j2 - j5;
        if (((j5 ^ j2) & (j2 ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long b2 = b(j2, alb.d);
        boolean z = false;
        boolean z2 = j6 <= j3 && j3 <= b2;
        if (j6 <= j4 && j4 <= b2) {
            z = true;
        }
        if (z2 && z) {
            return Math.abs(j3 - j2) <= Math.abs(j4 - j2) ? j3 : j4;
        }
        if (!z2) {
            return z ? j4 : j6;
        }
        return j3;
    }

    public static long b(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return j2 * (j3 / j4);
        }
        double d2 = (double) j2;
        double d3 = (double) j3;
        double d4 = (double) j4;
        Double.isNaN(d3);
        Double.isNaN(d4);
        Double.isNaN(d2);
        return (long) (d2 * (d3 / d4));
    }

    public static long[] a(List list, long j2) {
        int size = list.size();
        long[] jArr = new long[size];
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i2 < size) {
                jArr[i2] = ((Long) list.get(i2)).longValue() / j3;
                i2++;
            }
        } else if (j2 < 1000000 && 1000000 % j2 == 0) {
            long j4 = 1000000 / j2;
            while (i2 < size) {
                jArr[i2] = ((Long) list.get(i2)).longValue() * j4;
                i2++;
            }
        } else {
            double d2 = (double) j2;
            Double.isNaN(d2);
            double d3 = 1000000.0d / d2;
            while (i2 < size) {
                double longValue = (double) ((Long) list.get(i2)).longValue();
                Double.isNaN(longValue);
                jArr[i2] = (long) (longValue * d3);
                i2++;
            }
        }
        return jArr;
    }

    public static void a(long[] jArr, long j2) {
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j3;
                i2++;
            }
        } else if (j2 < 1000000 && 1000000 % j2 == 0) {
            long j4 = 1000000 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j4;
                i2++;
            }
        } else {
            double d2 = (double) j2;
            Double.isNaN(d2);
            double d3 = 1000000.0d / d2;
            while (i2 < jArr.length) {
                double d4 = (double) jArr[i2];
                Double.isNaN(d4);
                jArr[i2] = (long) (d4 * d3);
                i2++;
            }
        }
    }

    public static String[] a(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] b(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] h(String str) {
        return !TextUtils.isEmpty(str) ? a(str.trim(), "(\\s*,\\s*)") : new String[0];
    }

    public static int[] a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) list.get(i2)).intValue();
        }
        return iArr;
    }

    public static String d(String str) {
        if (str != null) {
            return str.toLowerCase(Locale.US);
        }
        return null;
    }

    public static String e(String str) {
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
    public static String i(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) == '%') {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        int i5 = length - (i3 + i3);
        StringBuilder sb = new StringBuilder(i5);
        Matcher matcher = i.matcher(str);
        while (i3 > 0 && matcher.find()) {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            sb.append((CharSequence) str, i2, matcher.start());
            sb.append((char) parseInt);
            i2 = matcher.end();
            i3--;
        }
        if (i2 < length) {
            sb.append((CharSequence) str, i2, length);
        }
        if (sb.length() != i5) {
            return null;
        }
        return sb.toString();
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
