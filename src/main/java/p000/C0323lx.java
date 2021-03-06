package p000;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: lx */
/* compiled from: PG */
public final class C0323lx {

    /* renamed from: A */
    private static final C0321lv[] f9883A = {new C0321lv("ThumbnailImage", 256, 7), new C0321lv("CameraSettingsIFDPointer", 8224, 4), new C0321lv("ImageProcessingIFDPointer", 8256, 4)};

    /* renamed from: B */
    private static final C0321lv[] f9884B = {new C0321lv("PreviewImageStart", 257, 4), new C0321lv("PreviewImageLength", 258, 4)};

    /* renamed from: C */
    private static final C0321lv[] f9885C = {new C0321lv("AspectFrame", 4371, 3)};

    /* renamed from: D */
    private static final C0321lv[] f9886D;

    /* renamed from: E */
    private static final C0321lv[][] f9887E;

    /* renamed from: F */
    private static final C0321lv[] f9888F = {new C0321lv("SubIFDPointer", 330, 4), new C0321lv("ExifIFDPointer", 34665, 4), new C0321lv("GPSInfoIFDPointer", 34853, 4), new C0321lv("InteroperabilityIFDPointer", 40965, 4), new C0321lv("CameraSettingsIFDPointer", 8224, 1), new C0321lv("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: G */
    private static final HashMap[] f9889G = new HashMap[10];

    /* renamed from: H */
    private static final HashMap[] f9890H = new HashMap[10];

    /* renamed from: I */
    private static final HashSet f9891I = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));

    /* renamed from: J */
    private static final HashMap f9892J = new HashMap();

    /* renamed from: K */
    private static final byte[] f9893K;

    /* renamed from: L */
    private static final byte[] f9894L = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(f9898d);

    /* renamed from: a */
    public static final String[] f9895a = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: b */
    public static final int[] f9896b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: c */
    public static final byte[] f9897c = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: d */
    public static final Charset f9898d;

    /* renamed from: f */
    private static final int[] f9899f = {8, 8, 8};

    /* renamed from: g */
    private static final int[] f9900g = {8};

    /* renamed from: h */
    private static final byte[] f9901h = {-1, -40, -1};

    /* renamed from: i */
    private static final byte[] f9902i = {102, 116, 121, 112};

    /* renamed from: j */
    private static final byte[] f9903j = {109, 105, 102, 49};

    /* renamed from: k */
    private static final byte[] f9904k = {104, 101, 105, 99};

    /* renamed from: l */
    private static final byte[] f9905l = {79, 76, 89, 77, 80, 0};

    /* renamed from: m */
    private static final byte[] f9906m = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: n */
    private static final byte[] f9907n = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: o */
    private static final byte[] f9908o = {101, 88, 73, 102};

    /* renamed from: p */
    private static final byte[] f9909p = {73, 72, 68, 82};

    /* renamed from: q */
    private static final byte[] f9910q = {73, 69, 78, 68};

    /* renamed from: r */
    private static final byte[] f9911r = {82, 73, 70, 70};

    /* renamed from: s */
    private static final byte[] f9912s = {87, 69, 66, 80};

    /* renamed from: t */
    private static final byte[] f9913t = {69, 88, 73, 70};

    /* renamed from: u */
    private static final C0321lv[] f9914u = {new C0321lv("NewSubfileType", 254, 4), new C0321lv("SubfileType", 255, 4), new C0321lv("ImageWidth", 256), new C0321lv("ImageLength", 257), new C0321lv("BitsPerSample", 258, 3), new C0321lv("Compression", 259, 3), new C0321lv("PhotometricInterpretation", 262, 3), new C0321lv("ImageDescription", 270, 2), new C0321lv("Make", 271, 2), new C0321lv("Model", 272, 2), new C0321lv("StripOffsets", 273), new C0321lv("Orientation", 274, 3), new C0321lv("SamplesPerPixel", 277, 3), new C0321lv("RowsPerStrip", 278), new C0321lv("StripByteCounts", 279), new C0321lv("XResolution", 282, 5), new C0321lv("YResolution", 283, 5), new C0321lv("PlanarConfiguration", 284, 3), new C0321lv("ResolutionUnit", 296, 3), new C0321lv("TransferFunction", 301, 3), new C0321lv("Software", 305, 2), new C0321lv("DateTime", 306, 2), new C0321lv("Artist", 315, 2), new C0321lv("WhitePoint", 318, 5), new C0321lv("PrimaryChromaticities", 319, 5), new C0321lv("SubIFDPointer", 330, 4), new C0321lv("JPEGInterchangeFormat", 513, 4), new C0321lv("JPEGInterchangeFormatLength", 514, 4), new C0321lv("YCbCrCoefficients", 529, 5), new C0321lv("YCbCrSubSampling", 530, 3), new C0321lv("YCbCrPositioning", 531, 3), new C0321lv("ReferenceBlackWhite", 532, 5), new C0321lv("Copyright", 33432, 2), new C0321lv("ExifIFDPointer", 34665, 4), new C0321lv("GPSInfoIFDPointer", 34853, 4), new C0321lv("SensorTopBorder", 4, 4), new C0321lv("SensorLeftBorder", 5, 4), new C0321lv("SensorBottomBorder", 6, 4), new C0321lv("SensorRightBorder", 7, 4), new C0321lv("ISO", 23, 3), new C0321lv("JpgFromRaw", 46, 7), new C0321lv("Xmp", 700, 1)};

    /* renamed from: v */
    private static final C0321lv[] f9915v = {new C0321lv("ExposureTime", 33434, 5), new C0321lv("FNumber", 33437, 5), new C0321lv("ExposureProgram", 34850, 3), new C0321lv("SpectralSensitivity", 34852, 2), new C0321lv("PhotographicSensitivity", 34855, 3), new C0321lv("OECF", 34856, 7), new C0321lv("ExifVersion", 36864, 2), new C0321lv("DateTimeOriginal", 36867, 2), new C0321lv("DateTimeDigitized", 36868, 2), new C0321lv("ComponentsConfiguration", 37121, 7), new C0321lv("CompressedBitsPerPixel", 37122, 5), new C0321lv("ShutterSpeedValue", 37377, 10), new C0321lv("ApertureValue", 37378, 5), new C0321lv("BrightnessValue", 37379, 10), new C0321lv("ExposureBiasValue", 37380, 10), new C0321lv("MaxApertureValue", 37381, 5), new C0321lv("SubjectDistance", 37382, 5), new C0321lv("MeteringMode", 37383, 3), new C0321lv("LightSource", 37384, 3), new C0321lv("Flash", 37385, 3), new C0321lv("FocalLength", 37386, 5), new C0321lv("SubjectArea", 37396, 3), new C0321lv("MakerNote", 37500, 7), new C0321lv("UserComment", 37510, 7), new C0321lv("SubSecTime", 37520, 2), new C0321lv("SubSecTimeOriginal", 37521, 2), new C0321lv("SubSecTimeDigitized", 37522, 2), new C0321lv("FlashpixVersion", 40960, 7), new C0321lv("ColorSpace", 40961, 3), new C0321lv("PixelXDimension", 40962), new C0321lv("PixelYDimension", 40963), new C0321lv("RelatedSoundFile", 40964, 2), new C0321lv("InteroperabilityIFDPointer", 40965, 4), new C0321lv("FlashEnergy", 41483, 5), new C0321lv("SpatialFrequencyResponse", 41484, 7), new C0321lv("FocalPlaneXResolution", 41486, 5), new C0321lv("FocalPlaneYResolution", 41487, 5), new C0321lv("FocalPlaneResolutionUnit", 41488, 3), new C0321lv("SubjectLocation", 41492, 3), new C0321lv("ExposureIndex", 41493, 5), new C0321lv("SensingMethod", 41495, 3), new C0321lv("FileSource", 41728, 7), new C0321lv("SceneType", 41729, 7), new C0321lv("CFAPattern", 41730, 7), new C0321lv("CustomRendered", 41985, 3), new C0321lv("ExposureMode", 41986, 3), new C0321lv("WhiteBalance", 41987, 3), new C0321lv("DigitalZoomRatio", 41988, 5), new C0321lv("FocalLengthIn35mmFilm", 41989, 3), new C0321lv("SceneCaptureType", 41990, 3), new C0321lv("GainControl", 41991, 3), new C0321lv("Contrast", 41992, 3), new C0321lv("Saturation", 41993, 3), new C0321lv("Sharpness", 41994, 3), new C0321lv("DeviceSettingDescription", 41995, 7), new C0321lv("SubjectDistanceRange", 41996, 3), new C0321lv("ImageUniqueID", 42016, 2), new C0321lv("DNGVersion", 50706, 1), new C0321lv("DefaultCropSize", 50720)};

    /* renamed from: w */
    private static final C0321lv[] f9916w = {new C0321lv("GPSVersionID", 0, 1), new C0321lv("GPSLatitudeRef", 1, 2), new C0321lv("GPSLatitude", 2, 5), new C0321lv("GPSLongitudeRef", 3, 2), new C0321lv("GPSLongitude", 4, 5), new C0321lv("GPSAltitudeRef", 5, 1), new C0321lv("GPSAltitude", 6, 5), new C0321lv("GPSTimeStamp", 7, 5), new C0321lv("GPSSatellites", 8, 2), new C0321lv("GPSStatus", 9, 2), new C0321lv("GPSMeasureMode", 10, 2), new C0321lv("GPSDOP", 11, 5), new C0321lv("GPSSpeedRef", 12, 2), new C0321lv("GPSSpeed", 13, 5), new C0321lv("GPSTrackRef", 14, 2), new C0321lv("GPSTrack", 15, 5), new C0321lv("GPSImgDirectionRef", 16, 2), new C0321lv("GPSImgDirection", 17, 5), new C0321lv("GPSMapDatum", 18, 2), new C0321lv("GPSDestLatitudeRef", 19, 2), new C0321lv("GPSDestLatitude", 20, 5), new C0321lv("GPSDestLongitudeRef", 21, 2), new C0321lv("GPSDestLongitude", 22, 5), new C0321lv("GPSDestBearingRef", 23, 2), new C0321lv("GPSDestBearing", 24, 5), new C0321lv("GPSDestDistanceRef", 25, 2), new C0321lv("GPSDestDistance", 26, 5), new C0321lv("GPSProcessingMethod", 27, 7), new C0321lv("GPSAreaInformation", 28, 7), new C0321lv("GPSDateStamp", 29, 2), new C0321lv("GPSDifferential", 30, 3)};

    /* renamed from: x */
    private static final C0321lv[] f9917x = {new C0321lv("InteroperabilityIndex", 1, 2)};

    /* renamed from: y */
    private static final C0321lv[] f9918y = {new C0321lv("NewSubfileType", 254, 4), new C0321lv("SubfileType", 255, 4), new C0321lv("ThumbnailImageWidth", 256), new C0321lv("ThumbnailImageLength", 257), new C0321lv("BitsPerSample", 258, 3), new C0321lv("Compression", 259, 3), new C0321lv("PhotometricInterpretation", 262, 3), new C0321lv("ImageDescription", 270, 2), new C0321lv("Make", 271, 2), new C0321lv("Model", 272, 2), new C0321lv("StripOffsets", 273), new C0321lv("ThumbnailOrientation", 274, 3), new C0321lv("SamplesPerPixel", 277, 3), new C0321lv("RowsPerStrip", 278), new C0321lv("StripByteCounts", 279), new C0321lv("XResolution", 282, 5), new C0321lv("YResolution", 283, 5), new C0321lv("PlanarConfiguration", 284, 3), new C0321lv("ResolutionUnit", 296, 3), new C0321lv("TransferFunction", 301, 3), new C0321lv("Software", 305, 2), new C0321lv("DateTime", 306, 2), new C0321lv("Artist", 315, 2), new C0321lv("WhitePoint", 318, 5), new C0321lv("PrimaryChromaticities", 319, 5), new C0321lv("SubIFDPointer", 330, 4), new C0321lv("JPEGInterchangeFormat", 513, 4), new C0321lv("JPEGInterchangeFormatLength", 514, 4), new C0321lv("YCbCrCoefficients", 529, 5), new C0321lv("YCbCrSubSampling", 530, 3), new C0321lv("YCbCrPositioning", 531, 3), new C0321lv("ReferenceBlackWhite", 532, 5), new C0321lv("Copyright", 33432, 2), new C0321lv("ExifIFDPointer", 34665, 4), new C0321lv("GPSInfoIFDPointer", 34853, 4), new C0321lv("DNGVersion", 50706, 1), new C0321lv("DefaultCropSize", 50720)};

    /* renamed from: z */
    private static final C0321lv f9919z = new C0321lv("StripOffsets", 273, 3);

    /* renamed from: M */
    private FileDescriptor f9920M;

    /* renamed from: N */
    private AssetManager.AssetInputStream f9921N;

    /* renamed from: O */
    private int f9922O;

    /* renamed from: P */
    private final HashMap[] f9923P = new HashMap[10];

    /* renamed from: Q */
    private Set f9924Q = new HashSet(10);

    /* renamed from: R */
    private int f9925R;

    /* renamed from: S */
    private int f9926S;

    /* renamed from: T */
    private int f9927T;

    /* renamed from: U */
    private int f9928U;

    /* renamed from: V */
    private int f9929V;

    /* renamed from: e */
    public ByteOrder f9930e = ByteOrder.BIG_ENDIAN;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        C0321lv[] lvVarArr = {new C0321lv("ColorSpace", 55, 3)};
        f9886D = lvVarArr;
        C0321lv[] lvVarArr2 = f9914u;
        f9887E = new C0321lv[][]{lvVarArr2, f9915v, f9916w, f9917x, f9918y, lvVarArr2, f9883A, f9884B, f9885C, lvVarArr};
        new C0321lv("JPEGInterchangeFormat", 513, 4);
        new C0321lv("JPEGInterchangeFormatLength", 514, 4);
        Charset forName = Charset.forName("US-ASCII");
        f9898d = forName;
        f9893K = "Exif\u0000\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < 10; i++) {
            f9889G[i] = new HashMap();
            f9890H[i] = new HashMap();
            for (C0321lv lvVar : f9887E[i]) {
                f9889G[i].put(Integer.valueOf(lvVar.f9877a), lvVar);
                f9890H[i].put(lvVar.f9878b, lvVar);
            }
        }
        f9892J.put(Integer.valueOf(f9888F[0].f9877a), 5);
        f9892J.put(Integer.valueOf(f9888F[1].f9877a), 1);
        f9892J.put(Integer.valueOf(f9888F[2].f9877a), 2);
        f9892J.put(Integer.valueOf(f9888F[3].f9877a), 3);
        f9892J.put(Integer.valueOf(f9888F[4].f9877a), 7);
        f9892J.put(Integer.valueOf(f9888F[5].f9877a), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lu.a(int, java.nio.ByteOrder):lu
     arg types: [short, java.nio.ByteOrder]
     candidates:
      lu.a(long, java.nio.ByteOrder):lu
      lu.a(lw, java.nio.ByteOrder):lu
      lu.a(int, java.nio.ByteOrder):lu */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0173, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0174, code lost:
        if (r7 != null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0176, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r7 = new p000.C0319lt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r8 = m7936d(r7);
        r1.f9930e = r8;
        r7.f9870a = r8;
        r8 = r7.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x018f, code lost:
        if (r8 == 85) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0192, code lost:
        r2 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0195, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0196, code lost:
        r2 = r0;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x019c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x019d, code lost:
        r2 = r0;
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01a0, code lost:
        if (r16 != null) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01a2, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01a5, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01a7, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01a8, code lost:
        if (r7 != null) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01aa, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01af, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b3, code lost:
        if (r7 < p000.C0323lx.f9907n.length) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01bb, code lost:
        if (r2[r7] == p000.C0323lx.f9907n[r7]) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01bd, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c0, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01c4, code lost:
        if (r7 < p000.C0323lx.f9911r.length) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01cc, code lost:
        if (r2[r7] == p000.C0323lx.f9911r[r7]) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01ce, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01d1, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01d3, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01d8, code lost:
        if (r7 < p000.C0323lx.f9912s.length) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01e5, code lost:
        if (r2[(p000.C0323lx.f9911r.length + r7) + 4] == p000.C0323lx.f9912s[r7]) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01e7, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x01ea, code lost:
        r2 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01ed, code lost:
        r2 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01f0, code lost:
        r2 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
        r11 = "FUJIFILMCCD-RAW".getBytes(java.nio.charset.Charset.defaultCharset());
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0092, code lost:
        if (r12 >= r11.length) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        if (r2[r12] != r11[r12]) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0526, code lost:
        if (java.util.Arrays.equals(r4, p000.C0323lx.f9899f) != false) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r7 = new p000.C0319lt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r7.f9870a = java.nio.ByteOrder.BIG_ENDIAN;
        r11 = (long) r7.readInt();
        r8 = new byte[4];
        r7.read(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        if (java.util.Arrays.equals(r8, p000.C0323lx.f9902i) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        r18 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        if (r11 != 1) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c2, code lost:
        r11 = r7.readLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        if (r11 < 16) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cb, code lost:
        r18 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        r22 = 5000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        if (r11 <= 5000) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d4, code lost:
        r22 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d6, code lost:
        r22 = r22 - r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        if (r22 >= 8) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r8 = new byte[4];
        r11 = 0;
        r15 = false;
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ef, code lost:
        if (r11 < (r22 / 4)) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f6, code lost:
        if (r7.read(r8) != 4) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fa, code lost:
        if (r11 == 1) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0102, code lost:
        if (java.util.Arrays.equals(r8, p000.C0323lx.f9903j) != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010a, code lost:
        if (java.util.Arrays.equals(r8, p000.C0323lx.f9904k) == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010c, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0110, code lost:
        if (r18 != false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0113, code lost:
        if (r15 != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r7.close();
        r2 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011d, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0123, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0124, code lost:
        r2 = r0;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012c, code lost:
        r2 = r0;
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012f, code lost:
        if (r16 != null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0131, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0134, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0136, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0137, code lost:
        if (r7 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r7 = new p000.C0319lt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r8 = m7936d(r7);
        r1.f9930e = r8;
        r7.f9870a = r8;
        r8 = r7.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014d, code lost:
        if (r8 == 20306) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0151, code lost:
        if (r8 == 21330) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0153, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0157, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015b, code lost:
        if (r8 != false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x015e, code lost:
        r2 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0161, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0162, code lost:
        r2 = r0;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0168, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0169, code lost:
        r2 = r0;
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x016c, code lost:
        if (r16 != null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x016e, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0171, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0176 A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0191 A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0192 A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01a2 A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01aa A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01b5 A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0206 A[SYNTHETIC, Splitter:B:151:0x0206] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x020b A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0210 A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x031d A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0359 A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03c6 A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04b5 A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x04ba A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x04cc A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0590 A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x01ed A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0131 A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x016e A[Catch:{ all -> 0x0317, IOException -> 0x05a4, all -> 0x059e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0323lx(java.io.InputStream r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            java.lang.String r3 = "PhotographicSensitivity"
            java.lang.String r4 = "yes"
            r26.<init>()
            r5 = 10
            java.util.HashMap[] r6 = new java.util.HashMap[r5]
            r1.f9923P = r6
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r5)
            r1.f9924Q = r6
            java.nio.ByteOrder r6 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f9930e = r6
            boolean r6 = r2 instanceof android.content.res.AssetManager.AssetInputStream
            r7 = 0
            r9 = 0
            r10 = 0
            if (r6 == 0) goto L_0x002d
            r6 = r2
            android.content.res.AssetManager$AssetInputStream r6 = (android.content.res.AssetManager.AssetInputStream) r6
            r1.f9921N = r6
            r1.f9920M = r9
            r6 = 0
            goto L_0x0052
        L_0x002d:
            boolean r6 = r2 instanceof java.io.FileInputStream
            if (r6 == 0) goto L_0x004b
            r6 = r2
            java.io.FileInputStream r6 = (java.io.FileInputStream) r6
            java.io.FileDescriptor r11 = r6.getFD()
            int r12 = android.os.Build.VERSION.SDK_INT
            int r12 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x004a }
            android.system.Os.lseek(r11, r7, r12)     // Catch:{ Exception -> 0x004a }
            r1.f9921N = r9
            java.io.FileDescriptor r6 = r6.getFD()
            r1.f9920M = r6
            r6 = 0
            goto L_0x0052
        L_0x004a:
            r0 = move-exception
        L_0x004b:
            r1.f9921N = r9
            r1.f9920M = r9
            r6 = 0
        L_0x0052:
            if (r6 >= r5) goto L_0x0060
            java.util.HashMap[] r11 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r12.<init>()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r11[r6] = r12     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r6 = r6 + 1
            goto L_0x0052
        L_0x0060:
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r11 = 5000(0x1388, float:7.006E-42)
            r6.<init>(r2, r11)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r6.mark(r11)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r2 = new byte[r11]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r6.read(r2)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r6.reset()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r11 = 0
        L_0x0073:
            byte[] r12 = p000.C0323lx.f9901h     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r12 = r12.length     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r13 = 8
            r5 = 4
            if (r11 < r12) goto L_0x007e
            r2 = 4
            goto L_0x01f2
        L_0x007e:
            byte r12 = r2[r11]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r17 = p000.C0323lx.f9901h     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte r15 = r17[r11]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r12 == r15) goto L_0x0597
            java.lang.String r11 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r12 = java.nio.charset.Charset.defaultCharset()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r11 = r11.getBytes(r12)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r12 = 0
        L_0x0091:
            int r15 = r11.length     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r12 >= r15) goto L_0x01f0
            byte r15 = r2[r12]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte r7 = r11[r12]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r15 != r7) goto L_0x009f
            int r12 = r12 + 1
            r7 = 0
            goto L_0x0091
        L_0x009f:
            lt r7 = new lt     // Catch:{ Exception -> 0x0135, all -> 0x012b }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0135, all -> 0x012b }
            java.nio.ByteOrder r8 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            r7.f9870a = r8     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            int r8 = r7.readInt()     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            long r11 = (long) r8     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            byte[] r8 = new byte[r5]     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            r7.read(r8)     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            byte[] r15 = p000.C0323lx.f9902i     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            boolean r8 = java.util.Arrays.equals(r8, r15)     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            if (r8 == 0) goto L_0x00dc
            r18 = 16
            r20 = 1
            int r8 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r8 != 0) goto L_0x00cb
            long r11 = r7.readLong()     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            int r8 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r8 < 0) goto L_0x00dc
            goto L_0x00cd
        L_0x00cb:
            r18 = r13
        L_0x00cd:
            r22 = 5000(0x1388, double:2.4703E-320)
            int r8 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            r22 = r11
        L_0x00d6:
            long r22 = r22 - r18
            int r8 = (r22 > r13 ? 1 : (r22 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x00e0
        L_0x00dc:
            r7.close()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x013a
        L_0x00e0:
            byte[] r8 = new byte[r5]     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            r11 = 0
            r15 = 0
            r18 = 0
        L_0x00e9:
            r24 = 4
            long r24 = r22 / r24
            int r19 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r19 < 0) goto L_0x00f2
            goto L_0x0139
        L_0x00f2:
            int r13 = r7.read(r8)     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            if (r13 != r5) goto L_0x00dc
            int r13 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r13 == 0) goto L_0x011d
            byte[] r13 = p000.C0323lx.f9903j     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            boolean r13 = java.util.Arrays.equals(r8, r13)     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            if (r13 != 0) goto L_0x010e
            byte[] r13 = p000.C0323lx.f9904k     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            boolean r13 = java.util.Arrays.equals(r8, r13)     // Catch:{ Exception -> 0x0129, all -> 0x0123 }
            if (r13 == 0) goto L_0x0110
            r15 = 1
            goto L_0x0110
        L_0x010e:
            r18 = 1
        L_0x0110:
            if (r18 != 0) goto L_0x0113
            goto L_0x011d
        L_0x0113:
            if (r15 != 0) goto L_0x0116
            goto L_0x011d
        L_0x0116:
            r7.close()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r2 = 12
            goto L_0x01f2
        L_0x011d:
            long r11 = r11 + r20
            r13 = 8
            goto L_0x00e9
        L_0x0123:
            r0 = move-exception
            r2 = r0
            r16 = r7
            goto L_0x012f
        L_0x0129:
            r0 = move-exception
            goto L_0x0137
        L_0x012b:
            r0 = move-exception
            r2 = r0
            r16 = 0
        L_0x012f:
            if (r16 == 0) goto L_0x0134
            r16.close()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x0134:
            throw r2     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x0135:
            r0 = move-exception
            r7 = 0
        L_0x0137:
            if (r7 == 0) goto L_0x013a
        L_0x0139:
            goto L_0x00dc
        L_0x013a:
            lt r7 = new lt     // Catch:{ Exception -> 0x0172, all -> 0x0168 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0172, all -> 0x0168 }
            java.nio.ByteOrder r8 = m7936d(r7)     // Catch:{ Exception -> 0x0166, all -> 0x0161 }
            r1.f9930e = r8     // Catch:{ Exception -> 0x0166, all -> 0x0161 }
            r7.f9870a = r8     // Catch:{ Exception -> 0x0166, all -> 0x0161 }
            short r8 = r7.readShort()     // Catch:{ Exception -> 0x0166, all -> 0x0161 }
            r11 = 20306(0x4f52, float:2.8455E-41)
            if (r8 == r11) goto L_0x0157
            r11 = 21330(0x5352, float:2.989E-41)
            if (r8 == r11) goto L_0x0155
            r8 = 0
            goto L_0x0158
        L_0x0155:
        L_0x0157:
            r8 = 1
        L_0x0158:
            r7.close()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r8 != 0) goto L_0x015e
            goto L_0x0179
        L_0x015e:
            r2 = 7
            goto L_0x01f2
        L_0x0161:
            r0 = move-exception
            r2 = r0
            r16 = r7
            goto L_0x016c
        L_0x0166:
            r0 = move-exception
            goto L_0x0174
        L_0x0168:
            r0 = move-exception
            r2 = r0
            r16 = 0
        L_0x016c:
            if (r16 == 0) goto L_0x0171
            r16.close()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x0171:
            throw r2     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x0172:
            r0 = move-exception
            r7 = 0
        L_0x0174:
            if (r7 == 0) goto L_0x0179
            r7.close()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x0179:
            lt r7 = new lt     // Catch:{ Exception -> 0x01a6, all -> 0x019c }
            r7.<init>(r2)     // Catch:{ Exception -> 0x01a6, all -> 0x019c }
            java.nio.ByteOrder r8 = m7936d(r7)     // Catch:{ Exception -> 0x019a, all -> 0x0195 }
            r1.f9930e = r8     // Catch:{ Exception -> 0x019a, all -> 0x0195 }
            r7.f9870a = r8     // Catch:{ Exception -> 0x019a, all -> 0x0195 }
            short r8 = r7.readShort()     // Catch:{ Exception -> 0x019a, all -> 0x0195 }
            r7.close()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r7 = 85
            if (r8 == r7) goto L_0x0192
            goto L_0x01af
        L_0x0192:
            r2 = 10
            goto L_0x01f2
        L_0x0195:
            r0 = move-exception
            r2 = r0
            r16 = r7
            goto L_0x01a0
        L_0x019a:
            r0 = move-exception
            goto L_0x01a8
        L_0x019c:
            r0 = move-exception
            r2 = r0
            r16 = 0
        L_0x01a0:
            if (r16 == 0) goto L_0x01a5
            r16.close()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x01a5:
            throw r2     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x01a6:
            r0 = move-exception
            r7 = 0
        L_0x01a8:
            if (r7 == 0) goto L_0x01ae
            r7.close()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x01af
        L_0x01ae:
        L_0x01af:
            r7 = 0
        L_0x01b0:
            byte[] r8 = p000.C0323lx.f9907n     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r8 = r8.length     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r7 >= r8) goto L_0x01ed
            byte r8 = r2[r7]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r11 = p000.C0323lx.f9907n     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte r11 = r11[r7]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r8 != r11) goto L_0x01c0
            int r7 = r7 + 1
            goto L_0x01b0
        L_0x01c0:
            r7 = 0
        L_0x01c1:
            byte[] r8 = p000.C0323lx.f9911r     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r8 = r8.length     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r7 >= r8) goto L_0x01d3
            byte r8 = r2[r7]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r11 = p000.C0323lx.f9911r     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte r11 = r11[r7]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r8 != r11) goto L_0x01d1
            int r7 = r7 + 1
            goto L_0x01c1
        L_0x01d1:
            r2 = 0
            goto L_0x01f2
        L_0x01d3:
            r7 = 0
        L_0x01d5:
            byte[] r8 = p000.C0323lx.f9912s     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r8 = r8.length     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r7 >= r8) goto L_0x01ea
            byte[] r8 = p000.C0323lx.f9911r     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r8 = r8.length     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r8 = r8 + r7
            int r8 = r8 + r5
            byte r8 = r2[r8]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r11 = p000.C0323lx.f9912s     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte r11 = r11[r7]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r8 != r11) goto L_0x01d1
            int r7 = r7 + 1
            goto L_0x01d5
        L_0x01ea:
            r2 = 14
            goto L_0x01f2
        L_0x01ed:
            r2 = 13
            goto L_0x01f2
        L_0x01f0:
            r2 = 9
        L_0x01f2:
            r1.f9922O = r2     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lt r2 = new lt     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r2.<init>(r6)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r6 = r1.f9922O     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r8 = "ExifInterface"
            java.lang.String r11 = "ImageLength"
            java.lang.String r12 = "ImageWidth"
            r14 = 5
            r15 = 6
            switch(r6) {
                case 0: goto L_0x04ba;
                case 1: goto L_0x04ba;
                case 2: goto L_0x04ba;
                case 3: goto L_0x04ba;
                case 4: goto L_0x04b5;
                case 5: goto L_0x04ba;
                case 6: goto L_0x04ba;
                case 7: goto L_0x03c6;
                case 8: goto L_0x04ba;
                case 9: goto L_0x0359;
                case 10: goto L_0x031d;
                case 11: goto L_0x04ba;
                case 12: goto L_0x0210;
                case 13: goto L_0x020b;
                default: goto L_0x0206;
            }
        L_0x0206:
            r1.m7934c(r2)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x04bd
        L_0x020b:
            r1.m7932b(r2)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x04bd
        L_0x0210:
            android.media.MediaMetadataRetriever r3 = new android.media.MediaMetadataRetriever     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r3.<init>()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0317 }
            ls r6 = new ls     // Catch:{ all -> 0x0317 }
            r6.<init>(r2)     // Catch:{ all -> 0x0317 }
            r3.setDataSource(r6)     // Catch:{ all -> 0x0317 }
            r6 = 33
            java.lang.String r6 = r3.extractMetadata(r6)     // Catch:{ all -> 0x0317 }
            r14 = 34
            java.lang.String r14 = r3.extractMetadata(r14)     // Catch:{ all -> 0x0317 }
            r13 = 26
            java.lang.String r13 = r3.extractMetadata(r13)     // Catch:{ all -> 0x0317 }
            r7 = 17
            java.lang.String r7 = r3.extractMetadata(r7)     // Catch:{ all -> 0x0317 }
            boolean r13 = r4.equals(r13)     // Catch:{ all -> 0x0317 }
            if (r13 == 0) goto L_0x0250
            r4 = 29
            java.lang.String r4 = r3.extractMetadata(r4)     // Catch:{ all -> 0x0317 }
            r7 = 30
            java.lang.String r7 = r3.extractMetadata(r7)     // Catch:{ all -> 0x0317 }
            r13 = 31
            java.lang.String r13 = r3.extractMetadata(r13)     // Catch:{ all -> 0x0317 }
            goto L_0x026e
        L_0x0250:
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x0317 }
            if (r4 == 0) goto L_0x026a
            r4 = 18
            java.lang.String r4 = r3.extractMetadata(r4)     // Catch:{ all -> 0x0317 }
            r7 = 19
            java.lang.String r7 = r3.extractMetadata(r7)     // Catch:{ all -> 0x0317 }
            r13 = 24
            java.lang.String r13 = r3.extractMetadata(r13)     // Catch:{ all -> 0x0317 }
            goto L_0x026e
        L_0x026a:
            r4 = 0
            r7 = 0
            r13 = 0
        L_0x026e:
            if (r4 == 0) goto L_0x0281
            java.util.HashMap[] r5 = r1.f9923P     // Catch:{ all -> 0x0317 }
            r5 = r5[r10]     // Catch:{ all -> 0x0317 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x0317 }
            java.nio.ByteOrder r9 = r1.f9930e     // Catch:{ all -> 0x0317 }
            lu r4 = p000.C0320lu.m7912a(r4, r9)     // Catch:{ all -> 0x0317 }
            r5.put(r12, r4)     // Catch:{ all -> 0x0317 }
        L_0x0281:
            if (r7 == 0) goto L_0x0294
            java.util.HashMap[] r4 = r1.f9923P     // Catch:{ all -> 0x0317 }
            r4 = r4[r10]     // Catch:{ all -> 0x0317 }
            int r5 = java.lang.Integer.parseInt(r7)     // Catch:{ all -> 0x0317 }
            java.nio.ByteOrder r7 = r1.f9930e     // Catch:{ all -> 0x0317 }
            lu r5 = p000.C0320lu.m7912a(r5, r7)     // Catch:{ all -> 0x0317 }
            r4.put(r11, r5)     // Catch:{ all -> 0x0317 }
        L_0x0294:
            if (r13 == 0) goto L_0x02c0
            int r4 = java.lang.Integer.parseInt(r13)     // Catch:{ all -> 0x0317 }
            r5 = 90
            if (r4 == r5) goto L_0x02af
            r5 = 180(0xb4, float:2.52E-43)
            if (r4 == r5) goto L_0x02ab
            r5 = 270(0x10e, float:3.78E-43)
            if (r4 == r5) goto L_0x02a8
            r4 = 1
            goto L_0x02b1
        L_0x02a8:
            r4 = 8
            goto L_0x02b1
        L_0x02ab:
            r4 = 3
            goto L_0x02b1
        L_0x02af:
            r4 = 6
        L_0x02b1:
            java.util.HashMap[] r5 = r1.f9923P     // Catch:{ all -> 0x0317 }
            r5 = r5[r10]     // Catch:{ all -> 0x0317 }
            java.lang.String r7 = "Orientation"
            java.nio.ByteOrder r9 = r1.f9930e     // Catch:{ all -> 0x0317 }
            lu r4 = p000.C0320lu.m7912a(r4, r9)     // Catch:{ all -> 0x0317 }
            r5.put(r7, r4)     // Catch:{ all -> 0x0317 }
        L_0x02c0:
            if (r6 != 0) goto L_0x02c3
            goto L_0x0312
        L_0x02c3:
            if (r14 == 0) goto L_0x0312
            int r4 = java.lang.Integer.parseInt(r6)     // Catch:{ all -> 0x0317 }
            int r5 = java.lang.Integer.parseInt(r14)     // Catch:{ all -> 0x0317 }
            if (r5 <= r15) goto L_0x030a
            long r6 = (long) r4     // Catch:{ all -> 0x0317 }
            r2.mo5548a(r6)     // Catch:{ all -> 0x0317 }
            byte[] r4 = new byte[r15]     // Catch:{ all -> 0x0317 }
            int r6 = r2.read(r4)     // Catch:{ all -> 0x0317 }
            if (r6 != r15) goto L_0x0302
            int r5 = r5 + -6
            byte[] r6 = p000.C0323lx.f9893K     // Catch:{ all -> 0x0317 }
            boolean r4 = java.util.Arrays.equals(r4, r6)     // Catch:{ all -> 0x0317 }
            if (r4 == 0) goto L_0x02fa
            byte[] r4 = new byte[r5]     // Catch:{ all -> 0x0317 }
            int r6 = r2.read(r4)     // Catch:{ all -> 0x0317 }
            if (r6 != r5) goto L_0x02f2
            r1.m7926a(r4, r10)     // Catch:{ all -> 0x0317 }
            goto L_0x0312
        L_0x02f2:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0317 }
            java.lang.String r4 = "Can't read exif"
            r2.<init>(r4)     // Catch:{ all -> 0x0317 }
            throw r2     // Catch:{ all -> 0x0317 }
        L_0x02fa:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0317 }
            java.lang.String r4 = "Invalid identifier"
            r2.<init>(r4)     // Catch:{ all -> 0x0317 }
            throw r2     // Catch:{ all -> 0x0317 }
        L_0x0302:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0317 }
            java.lang.String r4 = "Can't read identifier"
            r2.<init>(r4)     // Catch:{ all -> 0x0317 }
            throw r2     // Catch:{ all -> 0x0317 }
        L_0x030a:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0317 }
            java.lang.String r4 = "Invalid exif length"
            r2.<init>(r4)     // Catch:{ all -> 0x0317 }
            throw r2     // Catch:{ all -> 0x0317 }
        L_0x0312:
            r3.release()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x04bd
        L_0x0317:
            r0 = move-exception
            r2 = r0
            r3.release()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            throw r2     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x031d:
            r1.m7922a(r2)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.util.HashMap[] r4 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4 = r4[r10]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r5 = "JpgFromRaw"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r4 = (p000.C0320lu) r4     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r4 != 0) goto L_0x032f
            goto L_0x0334
        L_0x032f:
            int r4 = r1.f9929V     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r1.m7924a(r2, r4, r14)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x0334:
            java.util.HashMap[] r4 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4 = r4[r10]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r5 = "ISO"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r4 = (p000.C0320lu) r4     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.util.HashMap[] r5 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r6 = 1
            r5 = r5[r6]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r5 = (p000.C0320lu) r5     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r4 == 0) goto L_0x04bd
            if (r5 != 0) goto L_0x04bd
            java.util.HashMap[] r5 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r6 = 1
            r5 = r5[r6]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r5.put(r3, r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x04bd
        L_0x0359:
            r3 = 84
            r2.skipBytes(r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r3 = 4
            byte[] r4 = new byte[r3]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r5 = new byte[r3]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r2.read(r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r2.skipBytes(r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r2.read(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r3 = r3.getInt()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r4 = r4.getInt()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r1.m7924a(r2, r3, r14)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            long r3 = (long) r4     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r2.mo5548a(r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r2.f9870a = r3     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r3 = r2.readInt()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4 = 0
        L_0x038c:
            if (r4 >= r3) goto L_0x04bd
            int r5 = r2.readUnsignedShort()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r6 = r2.readUnsignedShort()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lv r7 = p000.C0323lx.f9919z     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r7 = r7.f9877a     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r5 == r7) goto L_0x03a2
            r2.skipBytes(r6)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r4 = r4 + 1
            goto L_0x038c
        L_0x03a2:
            short r3 = r2.readShort()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            short r4 = r2.readShort()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.nio.ByteOrder r5 = r1.f9930e     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r3 = p000.C0320lu.m7912a(r3, r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.nio.ByteOrder r5 = r1.f9930e     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r4 = p000.C0320lu.m7912a(r4, r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.util.HashMap[] r5 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r5 = r5[r10]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r5.put(r11, r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.util.HashMap[] r3 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r3 = r3[r10]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r3.put(r12, r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x04bd
        L_0x03c6:
            r1.m7922a(r2)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.util.HashMap[] r3 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4 = 1
            r3 = r3[r4]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r4 = "MakerNote"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r3 = (p000.C0320lu) r3     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r3 == 0) goto L_0x04bd
            lt r4 = new lt     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r3 = r3.f9875b     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4.<init>(r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.nio.ByteOrder r3 = r1.f9930e     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4.f9870a = r3     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r3 = p000.C0323lx.f9905l     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r3 = r3.length     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r3 = new byte[r3]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4.readFully(r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r5 = 0
            r4.mo5548a(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r7 = p000.C0323lx.f9906m     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r7 = r7.length     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r7 = new byte[r7]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4.readFully(r7)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r9 = p000.C0323lx.f9905l     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            boolean r3 = java.util.Arrays.equals(r3, r9)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r3 != 0) goto L_0x040e
            byte[] r3 = p000.C0323lx.f9906m     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            boolean r3 = java.util.Arrays.equals(r7, r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r3 == 0) goto L_0x0414
            r5 = 12
            r4.mo5548a(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x0414
        L_0x040e:
            r5 = 8
            r4.mo5548a(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x0414:
            r1.m7933b(r4, r15)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.util.HashMap[] r3 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4 = 7
            r3 = r3[r4]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r4 = "PreviewImageStart"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r3 = (p000.C0320lu) r3     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.util.HashMap[] r4 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r5 = 7
            r4 = r4[r5]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r5 = "PreviewImageLength"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r4 = (p000.C0320lu) r4     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r3 != 0) goto L_0x0435
            goto L_0x0449
        L_0x0435:
            if (r4 == 0) goto L_0x0449
            java.util.HashMap[] r5 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r5 = r5[r14]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r6 = "JPEGInterchangeFormat"
            r5.put(r6, r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.util.HashMap[] r3 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r3 = r3[r14]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r5 = "JPEGInterchangeFormatLength"
            r3.put(r5, r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x0449:
            java.util.HashMap[] r3 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4 = 8
            r3 = r3[r4]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r4 = "AspectFrame"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r3 = (p000.C0320lu) r3     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r3 == 0) goto L_0x04bd
            java.nio.ByteOrder r4 = r1.f9930e     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.Object r3 = r3.mo5567a(r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int[] r3 = (int[]) r3     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r3 != 0) goto L_0x0464
            goto L_0x049c
        L_0x0464:
            int r4 = r3.length     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r5 = 4
            if (r4 != r5) goto L_0x049c
            r4 = 2
            r4 = r3[r4]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r5 = r3[r10]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r4 <= r5) goto L_0x04bd
            r6 = 3
            r7 = r3[r6]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r6 = 1
            r3 = r3[r6]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r7 <= r3) goto L_0x04bd
            int r4 = r4 - r5
            int r4 = r4 + r6
            int r7 = r7 - r3
            int r7 = r7 + r6
            if (r4 >= r7) goto L_0x0481
            int r4 = r4 + r7
            int r7 = r4 - r7
            int r4 = r4 - r7
        L_0x0481:
            java.nio.ByteOrder r3 = r1.f9930e     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r3 = p000.C0320lu.m7912a(r4, r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.nio.ByteOrder r4 = r1.f9930e     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r4 = p000.C0320lu.m7912a(r7, r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.util.HashMap[] r5 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r5 = r5[r10]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r5.put(r12, r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.util.HashMap[] r3 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r3 = r3[r10]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r3.put(r11, r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x04bd
        L_0x049c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4.<init>()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r5 = "Invalid aspect frame values. frame="
            r4.append(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r3 = java.util.Arrays.toString(r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4.append(r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r3 = r4.toString()     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            android.util.Log.w(r8, r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x04bd
        L_0x04b5:
            r1.m7924a(r2, r10, r10)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x04bd
        L_0x04ba:
            r1.m7922a(r2)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x04bd:
            java.util.HashMap[] r3 = r1.f9923P     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r4 = 4
            r3 = r3[r4]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r4 = "Compression"
            java.lang.Object r4 = r3.get(r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r4 = (p000.C0320lu) r4     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r4 == 0) goto L_0x0590
            java.nio.ByteOrder r5 = r1.f9930e     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r4 = r4.mo5568b(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r5 = 1
            if (r4 == r5) goto L_0x04e1
            if (r4 == r15) goto L_0x04dc
            r5 = 7
            if (r4 == r5) goto L_0x04e1
            goto L_0x0593
        L_0x04dc:
            r1.m7925a(r2, r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x0593
        L_0x04e1:
            java.lang.String r4 = "BitsPerSample"
            java.lang.Object r4 = r3.get(r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r4 = (p000.C0320lu) r4     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r4 == 0) goto L_0x0593
            java.nio.ByteOrder r5 = r1.f9930e     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.Object r4 = r4.mo5567a(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int[] r4 = (int[]) r4     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int[] r5 = p000.C0323lx.f9899f     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            boolean r5 = java.util.Arrays.equals(r5, r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r5 == 0) goto L_0x04fc
            goto L_0x0528
        L_0x04fc:
            int r5 = r1.f9922O     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r6 = 3
            if (r5 != r6) goto L_0x0593
            java.lang.String r5 = "PhotometricInterpretation"
            java.lang.Object r5 = r3.get(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r5 = (p000.C0320lu) r5     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r5 == 0) goto L_0x0593
            java.nio.ByteOrder r6 = r1.f9930e     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r5 = r5.mo5568b(r6)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r6 = 1
            if (r5 != r6) goto L_0x051e
            int[] r5 = p000.C0323lx.f9900g     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            boolean r4 = java.util.Arrays.equals(r4, r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r4 != 0) goto L_0x0528
            goto L_0x0593
        L_0x051e:
            if (r5 != r15) goto L_0x0593
            int[] r5 = p000.C0323lx.f9899f     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            boolean r4 = java.util.Arrays.equals(r4, r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r4 == 0) goto L_0x0593
        L_0x0528:
            java.lang.String r4 = "StripOffsets"
            java.lang.Object r4 = r3.get(r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r4 = (p000.C0320lu) r4     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.String r5 = "StripByteCounts"
            java.lang.Object r3 = r3.get(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            lu r3 = (p000.C0320lu) r3     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r4 != 0) goto L_0x053b
            goto L_0x0593
        L_0x053b:
            if (r3 == 0) goto L_0x0593
            java.nio.ByteOrder r5 = r1.f9930e     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.Object r4 = r4.mo5567a(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            long[] r4 = m7929a(r4)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.nio.ByteOrder r5 = r1.f9930e     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            java.lang.Object r3 = r3.mo5567a(r5)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            long[] r3 = m7929a(r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r4 != 0) goto L_0x0559
            java.lang.String r2 = "stripOffsets should not be null."
            android.util.Log.w(r8, r2)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x0593
        L_0x0559:
            if (r3 != 0) goto L_0x0561
            java.lang.String r2 = "stripByteCounts should not be null."
            android.util.Log.w(r8, r2)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            goto L_0x0593
        L_0x0561:
            int r5 = r3.length     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r6 = 0
            r7 = 0
        L_0x0565:
            if (r6 < r5) goto L_0x0589
            int r5 = (int) r7     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x056d:
            int r9 = r4.length     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            if (r6 >= r9) goto L_0x0593
            r11 = r4[r6]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r9 = (int) r11     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r11 = r3[r6]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r12 = (int) r11     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r9 = r9 - r7
            long r13 = (long) r9     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r2.mo5548a(r13)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r7 = r7 + r9
            byte[] r9 = new byte[r12]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            r2.read(r9)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r7 = r7 + r12
            java.lang.System.arraycopy(r9, r10, r5, r8, r12)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            int r8 = r8 + r12
            int r6 = r6 + 1
            goto L_0x056d
        L_0x0589:
            r11 = r3[r6]     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
            long r7 = r7 + r11
            int r6 = r6 + 1
            goto L_0x0565
        L_0x0590:
            r1.m7925a(r2, r3)     // Catch:{ IOException -> 0x05a4, all -> 0x059e }
        L_0x0593:
            r26.m7920a()
            return
        L_0x0597:
            int r11 = r11 + 1
            r5 = 10
            r9 = 0
            goto L_0x0073
        L_0x059e:
            r0 = move-exception
            r2 = r0
            r26.m7920a()
            throw r2
        L_0x05a4:
            r0 = move-exception
            goto L_0x0593
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0323lx.<init>(java.io.InputStream):void");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lu.a(long, java.nio.ByteOrder):lu
     arg types: [int, java.nio.ByteOrder]
     candidates:
      lu.a(int, java.nio.ByteOrder):lu
      lu.a(lw, java.nio.ByteOrder):lu
      lu.a(long, java.nio.ByteOrder):lu */
    /* renamed from: a */
    private final void m7920a() {
        String b = m7930b("DateTimeOriginal");
        if (b != null && m7930b("DateTime") == null) {
            this.f9923P[0].put("DateTime", C0320lu.m7914a(b));
        }
        if (m7930b("ImageWidth") == null) {
            this.f9923P[0].put("ImageWidth", C0320lu.m7913a(0L, this.f9930e));
        }
        if (m7930b("ImageLength") == null) {
            this.f9923P[0].put("ImageLength", C0320lu.m7913a(0L, this.f9930e));
        }
        if (m7930b("Orientation") == null) {
            this.f9923P[0].put("Orientation", C0320lu.m7913a(0L, this.f9930e));
        }
        if (m7930b("LightSource") == null) {
            this.f9923P[1].put("LightSource", C0320lu.m7913a(0L, this.f9930e));
        }
    }

    /* renamed from: a */
    private static String m7919a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static long[] m7929a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (!(obj instanceof long[])) {
            return null;
        } else {
            return (long[]) obj;
        }
    }

    /* renamed from: b */
    private final String m7930b(String str) {
        double d;
        C0320lu a = mo5572a(str);
        if (a == null) {
            return null;
        }
        if (!f9891I.contains(str)) {
            return a.mo5569c(this.f9930e);
        }
        if (str.equals("GPSTimeStamp")) {
            int i = a.f9874a;
            if (i == 5 || i == 10) {
                C0322lw[] lwVarArr = (C0322lw[]) a.mo5567a(this.f9930e);
                if (lwVarArr != null && lwVarArr.length == 3) {
                    C0322lw lwVar = lwVarArr[0];
                    C0322lw lwVar2 = lwVarArr[1];
                    C0322lw lwVar3 = lwVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) lwVar.f9881a) / ((float) lwVar.f9882b))), Integer.valueOf((int) (((float) lwVar2.f9881a) / ((float) lwVar2.f9882b))), Integer.valueOf((int) (((float) lwVar3.f9881a) / ((float) lwVar3.f9882b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(lwVarArr));
                return null;
            }
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + a.f9874a);
            return null;
        }
        try {
            Object a2 = a.mo5567a(this.f9930e);
            if (a2 != null) {
                if (a2 instanceof String) {
                    d = Double.parseDouble((String) a2);
                } else if (a2 instanceof long[]) {
                    long[] jArr = (long[]) a2;
                    if (jArr.length == 1) {
                        d = (double) jArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (a2 instanceof int[]) {
                    int[] iArr = (int[]) a2;
                    if (iArr.length == 1) {
                        d = (double) iArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (a2 instanceof double[]) {
                    double[] dArr = (double[]) a2;
                    if (dArr.length == 1) {
                        d = dArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (a2 instanceof C0322lw[]) {
                    C0322lw[] lwVarArr2 = (C0322lw[]) a2;
                    if (lwVarArr2.length == 1) {
                        C0322lw lwVar4 = lwVarArr2[0];
                        double d2 = (double) lwVar4.f9881a;
                        double d3 = (double) lwVar4.f9882b;
                        Double.isNaN(d2);
                        Double.isNaN(d3);
                        d = d2 / d3;
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                return Double.toString(d);
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final C0320lu mo5572a(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < 10; i++) {
            C0320lu luVar = (C0320lu) this.f9923P[i].get(str);
            if (luVar != null) {
                return luVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054 A[FALL_THROUGH] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7924a(p000.C0319lt r11, int r12, int r13) {
        /*
            r10 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r11.f9870a = r0
            long r0 = (long) r12
            r11.mo5548a(r0)
            byte r0 = r11.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            r3 = 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L_0x0160
            byte r0 = r11.readByte()
            r4 = -40
            if (r0 != r4) goto L_0x0147
            int r12 = r12 + 2
        L_0x001d:
            byte r0 = r11.readByte()
            if (r0 != r2) goto L_0x012a
            byte r0 = r11.readByte()
            r1 = -39
            if (r0 != r1) goto L_0x002d
            goto L_0x0125
        L_0x002d:
            r1 = -38
            if (r0 == r1) goto L_0x0125
            int r1 = r11.readUnsignedShort()
            r4 = -2
            int r1 = r1 + r4
            int r12 = r12 + 4
            java.lang.String r5 = "Invalid length"
            if (r1 < 0) goto L_0x011f
            r6 = -31
            r7 = 1
            r8 = 0
            if (r0 == r6) goto L_0x00be
            if (r0 == r4) goto L_0x008f
            switch(r0) {
                case -64: goto L_0x0054;
                case -63: goto L_0x0054;
                case -62: goto L_0x0054;
                case -61: goto L_0x0054;
                default: goto L_0x0048;
            }
        L_0x0048:
            switch(r0) {
                case -59: goto L_0x0054;
                case -58: goto L_0x0054;
                case -57: goto L_0x0054;
                default: goto L_0x004b;
            }
        L_0x004b:
            switch(r0) {
                case -55: goto L_0x0054;
                case -54: goto L_0x0054;
                case -53: goto L_0x0054;
                default: goto L_0x004e;
            }
        L_0x004e:
            switch(r0) {
                case -51: goto L_0x0054;
                case -50: goto L_0x0054;
                case -49: goto L_0x0054;
                default: goto L_0x0051;
            }
        L_0x0051:
            r8 = r1
            goto L_0x0106
        L_0x0054:
            int r0 = r11.skipBytes(r7)
            if (r0 != r7) goto L_0x0087
            java.util.HashMap[] r0 = r10.f9923P
            r0 = r0[r13]
            int r4 = r11.readUnsignedShort()
            long r6 = (long) r4
            java.nio.ByteOrder r4 = r10.f9930e
            lu r4 = p000.C0320lu.m7913a(r6, r4)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r4)
            java.util.HashMap[] r0 = r10.f9923P
            r0 = r0[r13]
            int r4 = r11.readUnsignedShort()
            long r6 = (long) r4
            java.nio.ByteOrder r4 = r10.f9930e
            lu r4 = p000.C0320lu.m7913a(r6, r4)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r4)
            int r1 = r1 + -5
            r8 = r1
            goto L_0x0106
        L_0x0087:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Invalid SOFx"
            r11.<init>(r12)
            throw r11
        L_0x008f:
            byte[] r0 = new byte[r1]
            int r4 = r11.read(r0)
            if (r4 != r1) goto L_0x00b6
            java.lang.String r1 = "UserComment"
            java.lang.String r4 = r10.m7930b(r1)
            if (r4 != 0) goto L_0x00b4
            java.util.HashMap[] r4 = r10.f9923P
            r4 = r4[r7]
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = p000.C0323lx.f9898d
            r6.<init>(r0, r7)
            lu r0 = p000.C0320lu.m7914a(r6)
            r4.put(r1, r0)
            goto L_0x0106
        L_0x00b4:
            goto L_0x0106
        L_0x00b6:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Invalid exif"
            r11.<init>(r12)
            throw r11
        L_0x00be:
            byte[] r0 = new byte[r1]
            r11.readFully(r0)
            int r4 = r12 + r1
            byte[] r6 = p000.C0323lx.f9893K
            boolean r6 = m7928a(r0, r6)
            if (r6 == 0) goto L_0x00de
            byte[] r6 = p000.C0323lx.f9893K
            int r7 = r6.length
            int r6 = r6.length
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r6, r1)
            r10.m7926a(r0, r13)
            int r12 = r12 + r7
            r10.f9925R = r12
            r12 = r4
            goto L_0x0106
        L_0x00de:
            byte[] r12 = p000.C0323lx.f9894L
            boolean r12 = m7928a(r0, r12)
            if (r12 == 0) goto L_0x0105
            byte[] r12 = p000.C0323lx.f9894L
            int r12 = r12.length
            byte[] r12 = java.util.Arrays.copyOfRange(r0, r12, r1)
            java.lang.String r0 = "Xmp"
            java.lang.String r1 = r10.m7930b(r0)
            if (r1 != 0) goto L_0x0105
            java.util.HashMap[] r1 = r10.f9923P
            r1 = r1[r8]
            lu r6 = new lu
            int r9 = r12.length
            r6.<init>(r7, r9, r12, r8)
            r1.put(r0, r6)
            r12 = r4
            goto L_0x0106
        L_0x0105:
            r12 = r4
        L_0x0106:
            if (r8 < 0) goto L_0x0119
            int r0 = r11.skipBytes(r8)
            if (r0 != r8) goto L_0x0111
            int r12 = r12 + r8
            goto L_0x001d
        L_0x0111:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Invalid JPEG segment"
            r11.<init>(r12)
            throw r11
        L_0x0119:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r5)
            throw r11
        L_0x011f:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r5)
            throw r11
        L_0x0125:
            java.nio.ByteOrder r12 = r10.f9930e
            r11.f9870a = r12
            return
        L_0x012a:
            java.io.IOException r11 = new java.io.IOException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Invalid marker:"
            r12.append(r13)
            r13 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0147:
            java.io.IOException r11 = new java.io.IOException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r1)
            java.lang.String r13 = java.lang.Integer.toHexString(r3)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0160:
            java.io.IOException r11 = new java.io.IOException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r1)
            r13 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            goto L_0x017c
        L_0x017b:
            throw r11
        L_0x017c:
            goto L_0x017b
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0323lx.m7924a(lt, int, int):void");
    }

    /* renamed from: b */
    private final void m7932b(C0319lt ltVar) {
        ltVar.f9870a = ByteOrder.BIG_ENDIAN;
        ltVar.skipBytes(f9907n.length);
        int length = f9907n.length;
        while (true) {
            try {
                int readInt = ltVar.readInt();
                byte[] bArr = new byte[4];
                if (ltVar.read(bArr) == 4) {
                    int i = length + 8;
                    if (i == 16) {
                        if (!Arrays.equals(bArr, f9909p)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (Arrays.equals(bArr, f9910q)) {
                        return;
                    }
                    if (!Arrays.equals(bArr, f9908o)) {
                        int i2 = readInt + 4;
                        ltVar.skipBytes(i2);
                        length = i + i2;
                    } else {
                        byte[] bArr2 = new byte[readInt];
                        if (ltVar.read(bArr2) == readInt) {
                            int readInt2 = ltVar.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr);
                            crc32.update(bArr2);
                            if (((int) crc32.getValue()) == readInt2) {
                                m7926a(bArr2, 0);
                                m7931b();
                                this.f9925R = i;
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m7919a(bArr));
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: a */
    private final void m7922a(C0319lt ltVar) {
        C0320lu luVar;
        m7923a(ltVar, ltVar.available());
        m7933b(ltVar, 0);
        m7935c(ltVar, 0);
        m7935c(ltVar, 5);
        m7935c(ltVar, 4);
        m7931b();
        if (this.f9922O == 8 && (luVar = (C0320lu) this.f9923P[1].get("MakerNote")) != null) {
            C0319lt ltVar2 = new C0319lt(luVar.f9875b);
            ltVar2.f9870a = this.f9930e;
            ltVar2.mo5548a(6);
            m7933b(ltVar2, 9);
            C0320lu luVar2 = (C0320lu) this.f9923P[9].get("ColorSpace");
            if (luVar2 != null) {
                this.f9923P[1].put("ColorSpace", luVar2);
            }
        }
    }

    /* renamed from: c */
    private final void m7934c(C0319lt ltVar) {
        int i;
        ltVar.f9870a = ByteOrder.LITTLE_ENDIAN;
        ltVar.skipBytes(f9911r.length);
        int readInt = ltVar.readInt() + 8;
        int skipBytes = ltVar.skipBytes(f9912s.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (ltVar.read(bArr) == 4) {
                    int readInt2 = ltVar.readInt();
                    i = skipBytes + 8;
                    if (!Arrays.equals(f9913t, bArr)) {
                        if (readInt2 % 2 == 1) {
                            readInt2++;
                        }
                        int i2 = i + readInt2;
                        if (i2 == readInt) {
                            break;
                        } else if (i2 <= readInt) {
                            int skipBytes2 = ltVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        byte[] bArr2 = new byte[readInt2];
                        if (ltVar.read(bArr2) == readInt2) {
                            m7926a(bArr2, 0);
                        } else {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + m7919a(bArr));
                        }
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
        this.f9925R = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r1 != 14) goto L_0x003f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7925a(p000.C0319lt r4, java.util.HashMap r5) {
        /*
            r3 = this;
            java.lang.String r0 = "JPEGInterchangeFormat"
            java.lang.Object r0 = r5.get(r0)
            lu r0 = (p000.C0320lu) r0
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            java.lang.Object r5 = r5.get(r1)
            lu r5 = (p000.C0320lu) r5
            if (r0 == 0) goto L_0x005b
            if (r5 == 0) goto L_0x005b
            java.nio.ByteOrder r1 = r3.f9930e
            int r0 = r0.mo5568b(r1)
            java.nio.ByteOrder r1 = r3.f9930e
            int r5 = r5.mo5568b(r1)
            int r1 = r3.f9922O
            r2 = 4
            if (r1 == r2) goto L_0x003c
            r2 = 7
            if (r1 == r2) goto L_0x0039
            r2 = 9
            if (r1 == r2) goto L_0x003c
            r2 = 10
            if (r1 == r2) goto L_0x003c
            r2 = 13
            if (r1 == r2) goto L_0x003c
            r2 = 14
            if (r1 == r2) goto L_0x003c
            goto L_0x003f
        L_0x0039:
            int r1 = r3.f9926S
            goto L_0x003e
        L_0x003c:
            int r1 = r3.f9925R
        L_0x003e:
            int r0 = r0 + r1
        L_0x003f:
            int r1 = r4.f9871b
            int r1 = r1 - r0
            int r5 = java.lang.Math.min(r5, r1)
            if (r0 <= 0) goto L_0x005b
            if (r5 <= 0) goto L_0x005b
            android.content.res.AssetManager$AssetInputStream r1 = r3.f9921N
            if (r1 != 0) goto L_0x005b
            java.io.FileDescriptor r1 = r3.f9920M
            if (r1 != 0) goto L_0x005b
            byte[] r5 = new byte[r5]
            long r0 = (long) r0
            r4.mo5548a(r0)
            r4.readFully(r5)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0323lx.m7925a(lt, java.util.HashMap):void");
    }

    /* renamed from: a */
    private final boolean m7927a(HashMap hashMap) {
        C0320lu luVar = (C0320lu) hashMap.get("ImageLength");
        C0320lu luVar2 = (C0320lu) hashMap.get("ImageWidth");
        if (luVar == null || luVar2 == null) {
            return false;
        }
        int b = luVar.mo5568b(this.f9930e);
        int b2 = luVar2.mo5568b(this.f9930e);
        if (b > 512 || b2 > 512) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m7923a(C0319lt ltVar, int i) {
        ByteOrder d = m7936d(ltVar);
        this.f9930e = d;
        ltVar.f9870a = d;
        int readUnsignedShort = ltVar.readUnsignedShort();
        int i2 = this.f9922O;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = ltVar.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && ltVar.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: d */
    private static final ByteOrder m7936d(C0319lt ltVar) {
        short readShort = ltVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: a */
    private final void m7926a(byte[] bArr, int i) {
        C0319lt ltVar = new C0319lt(bArr);
        m7923a(ltVar, bArr.length);
        m7933b(ltVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0097  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7933b(p000.C0319lt r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            java.util.Set r3 = r0.f9924Q
            int r4 = r1.f9872c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f9872c
            int r3 = r3 + 2
            int r4 = r1.f9871b
            if (r3 > r4) goto L_0x027e
            short r3 = r26.readShort()
            int r4 = r1.f9872c
            int r5 = r3 * 12
            int r4 = r4 + r5
            int r5 = r1.f9871b
            if (r4 > r5) goto L_0x027e
            if (r3 <= 0) goto L_0x027e
            r5 = 0
        L_0x0029:
            r8 = 4
            if (r5 >= r3) goto L_0x0238
            int r9 = r26.readUnsignedShort()
            int r10 = r26.readUnsignedShort()
            int r11 = r26.readInt()
            int r12 = r1.f9872c
            long r12 = (long) r12
            r14 = 4
            long r12 = r12 + r14
            java.util.HashMap[] r16 = p000.C0323lx.f9889G
            r4 = r16[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r4 = r4.get(r9)
            lv r4 = (p000.C0321lv) r4
            r14 = 9
            r6 = 3
            r7 = 7
            if (r4 != 0) goto L_0x0056
        L_0x0052:
            r6 = 0
        L_0x0054:
            r14 = 0
            goto L_0x0095
        L_0x0056:
            if (r10 <= 0) goto L_0x0052
            int[] r15 = p000.C0323lx.f9896b
            int r15 = r15.length
            if (r10 >= r15) goto L_0x0052
            int r15 = r4.f9879c
            if (r15 == r7) goto L_0x0078
            if (r10 == r7) goto L_0x0078
            if (r15 == r10) goto L_0x0078
            int r7 = r4.f9880d
            if (r7 == r10) goto L_0x0078
            if (r15 == r8) goto L_0x006e
            if (r7 == r8) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            if (r10 != r6) goto L_0x0072
            goto L_0x0078
        L_0x0072:
            if (r15 != r14) goto L_0x0052
            r7 = 8
            if (r10 != r7) goto L_0x0052
        L_0x0078:
            r7 = 7
            if (r10 != r7) goto L_0x007c
            r10 = r15
        L_0x007c:
            long r14 = (long) r11
            int[] r20 = p000.C0323lx.f9896b
            r7 = r20[r10]
            long r6 = (long) r7
            long r6 = r6 * r14
            r14 = 0
            int r21 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r21 < 0) goto L_0x0094
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r21 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r21 <= 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r14 = 1
            goto L_0x0095
        L_0x0094:
            goto L_0x0054
        L_0x0095:
            if (r14 == 0) goto L_0x0229
            java.lang.String r14 = "Compression"
            r17 = 4
            int r15 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x0148
            int r15 = r26.readInt()
            int r8 = r0.f9922O
            r18 = r3
            r3 = 7
            if (r8 != r3) goto L_0x011c
            java.lang.String r3 = r4.f9878b
            java.lang.String r8 = "MakerNote"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x0112
            r3 = 6
            if (r2 == r3) goto L_0x00c0
            r19 = r5
            r22 = r10
            r21 = r11
            r11 = r9
            goto L_0x0133
        L_0x00c0:
            java.lang.String r8 = r4.f9878b
            java.lang.String r3 = "ThumbnailImage"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x010a
            r0.f9927T = r15
            r0.f9928U = r11
            java.nio.ByteOrder r3 = r0.f9930e
            r8 = 6
            lu r3 = p000.C0320lu.m7912a(r8, r3)
            int r8 = r0.f9927T
            r19 = r5
            java.nio.ByteOrder r5 = r0.f9930e
            r22 = r10
            r21 = r11
            long r10 = (long) r8
            lu r5 = p000.C0320lu.m7913a(r10, r5)
            int r8 = r0.f9928U
            java.nio.ByteOrder r10 = r0.f9930e
            r11 = r9
            long r8 = (long) r8
            lu r8 = p000.C0320lu.m7913a(r8, r10)
            java.util.HashMap[] r9 = r0.f9923P
            r10 = 4
            r9 = r9[r10]
            r9.put(r14, r3)
            java.util.HashMap[] r3 = r0.f9923P
            r3 = r3[r10]
            java.lang.String r9 = "JPEGInterchangeFormat"
            r3.put(r9, r5)
            java.util.HashMap[] r3 = r0.f9923P
            r3 = r3[r10]
            java.lang.String r5 = "JPEGInterchangeFormatLength"
            r3.put(r5, r8)
            goto L_0x0133
        L_0x010a:
            r19 = r5
            r22 = r10
            r21 = r11
            r11 = r9
            goto L_0x0133
        L_0x0112:
            r19 = r5
            r22 = r10
            r21 = r11
            r11 = r9
            r0.f9926S = r15
            goto L_0x0133
        L_0x011c:
            r19 = r5
            r22 = r10
            r21 = r11
            r11 = r9
            r3 = 10
            if (r8 != r3) goto L_0x0133
            java.lang.String r3 = r4.f9878b
            java.lang.String r5 = "JpgFromRaw"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0133
            r0.f9929V = r15
        L_0x0133:
            long r8 = (long) r15
            long r23 = r8 + r6
            int r3 = r1.f9871b
            r5 = r14
            long r14 = (long) r3
            int r3 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r3 <= 0) goto L_0x0144
            r1.mo5548a(r12)
            r8 = 0
            goto L_0x0231
        L_0x0144:
            r1.mo5548a(r8)
            goto L_0x0152
        L_0x0148:
            r18 = r3
            r19 = r5
            r22 = r10
            r21 = r11
            r5 = r14
            r11 = r9
        L_0x0152:
            java.util.HashMap r3 = p000.C0323lx.f9892J
            java.lang.Object r3 = r3.get(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L_0x01ce
            int r3 = (int) r6
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            lu r6 = new lu
            r7 = r21
            r10 = r22
            r8 = 0
            r6.<init>(r10, r7, r3, r8)
            java.util.HashMap[] r3 = r0.f9923P
            r3 = r3[r2]
            java.lang.String r7 = r4.f9878b
            r3.put(r7, r6)
            java.lang.String r3 = r4.f9878b
            java.lang.String r7 = "DNGVersion"
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L_0x0180
            goto L_0x0184
        L_0x0180:
            r3 = 3
            r0.f9922O = r3
        L_0x0184:
            java.lang.String r3 = r4.f9878b
            java.lang.String r7 = "Make"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0190
        L_0x018f:
            goto L_0x019c
        L_0x0190:
            java.lang.String r3 = r4.f9878b
            java.lang.String r7 = "Model"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x01aa
            goto L_0x018f
        L_0x019c:
            java.nio.ByteOrder r3 = r0.f9930e
            java.lang.String r3 = r6.mo5569c(r3)
            java.lang.String r7 = "PENTAX"
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x01be
        L_0x01aa:
            java.lang.String r3 = r4.f9878b
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x01c3
            java.nio.ByteOrder r3 = r0.f9930e
            int r3 = r6.mo5568b(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 == r4) goto L_0x01be
            goto L_0x01c3
        L_0x01be:
            r3 = 8
            r0.f9922O = r3
        L_0x01c3:
            int r3 = r1.f9872c
            long r3 = (long) r3
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0231
            r1.mo5548a(r12)
            goto L_0x0231
        L_0x01ce:
            r10 = r22
            r8 = 0
            r4 = 3
            if (r10 == r4) goto L_0x01fa
            r4 = 4
            if (r10 == r4) goto L_0x01f4
            r4 = 8
            if (r10 == r4) goto L_0x01ed
            r4 = 9
            if (r10 == r4) goto L_0x01e6
            r4 = 13
            if (r10 == r4) goto L_0x01e6
            r4 = -1
            goto L_0x0201
        L_0x01e6:
            int r4 = r26.readInt()
            long r4 = (long) r4
            goto L_0x0201
        L_0x01ed:
            short r4 = r26.readShort()
            long r4 = (long) r4
            goto L_0x0201
        L_0x01f4:
            long r4 = r26.mo5547a()
            goto L_0x0201
        L_0x01fa:
            int r4 = r26.readUnsignedShort()
            long r4 = (long) r4
        L_0x0201:
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0225
            int r6 = r1.f9871b
            long r6 = (long) r6
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0225
            java.util.Set r6 = r0.f9924Q
            int r7 = (int) r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x0225
            r1.mo5548a(r4)
            int r3 = r3.intValue()
            r0.m7933b(r1, r3)
        L_0x0225:
            r1.mo5548a(r12)
            goto L_0x0231
        L_0x0229:
            r18 = r3
            r19 = r5
            r8 = 0
            r1.mo5548a(r12)
        L_0x0231:
            int r5 = r19 + 1
            short r5 = (short) r5
            r3 = r18
            goto L_0x0029
        L_0x0238:
            int r2 = r1.f9872c
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f9871b
            if (r2 > r3) goto L_0x027e
            int r2 = r26.readInt()
            long r3 = (long) r2
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x027e
            int r5 = r1.f9871b
            if (r2 >= r5) goto L_0x027e
            java.util.Set r5 = r0.f9924Q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L_0x027e
            r1.mo5548a(r3)
            java.util.HashMap[] r2 = r0.f9923P
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0278
            java.util.HashMap[] r2 = r0.f9923P
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x027e
            r0.m7933b(r1, r3)
            return
        L_0x0278:
            r2 = 4
            r0.m7933b(r1, r2)
            return
        L_0x027e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0323lx.m7933b(lt, int):void");
    }

    /* renamed from: a */
    private static boolean m7928a(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final void m7921a(int i, int i2) {
        if (!this.f9923P[i].isEmpty() && !this.f9923P[i2].isEmpty()) {
            C0320lu luVar = (C0320lu) this.f9923P[i].get("ImageLength");
            C0320lu luVar2 = (C0320lu) this.f9923P[i].get("ImageWidth");
            C0320lu luVar3 = (C0320lu) this.f9923P[i2].get("ImageLength");
            C0320lu luVar4 = (C0320lu) this.f9923P[i2].get("ImageWidth");
            if (luVar != null && luVar2 != null && luVar3 != null && luVar4 != null) {
                int b = luVar.mo5568b(this.f9930e);
                int b2 = luVar2.mo5568b(this.f9930e);
                int b3 = luVar3.mo5568b(this.f9930e);
                int b4 = luVar4.mo5568b(this.f9930e);
                if (b < b3 && b2 < b4) {
                    HashMap[] hashMapArr = this.f9923P;
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    /* renamed from: c */
    private final void m7935c(C0319lt ltVar, int i) {
        C0320lu luVar;
        C0320lu luVar2;
        C0320lu luVar3;
        C0320lu luVar4 = (C0320lu) this.f9923P[i].get("DefaultCropSize");
        C0320lu luVar5 = (C0320lu) this.f9923P[i].get("SensorTopBorder");
        C0320lu luVar6 = (C0320lu) this.f9923P[i].get("SensorLeftBorder");
        C0320lu luVar7 = (C0320lu) this.f9923P[i].get("SensorBottomBorder");
        C0320lu luVar8 = (C0320lu) this.f9923P[i].get("SensorRightBorder");
        if (luVar4 != null) {
            if (luVar4.f9874a != 5) {
                int[] iArr = (int[]) luVar4.mo5567a(this.f9930e);
                if (iArr != null && iArr.length == 2) {
                    luVar3 = C0320lu.m7912a(iArr[0], this.f9930e);
                    luVar2 = C0320lu.m7912a(iArr[1], this.f9930e);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            } else {
                C0322lw[] lwVarArr = (C0322lw[]) luVar4.mo5567a(this.f9930e);
                if (lwVarArr != null && lwVarArr.length == 2) {
                    luVar3 = C0320lu.m7915a(lwVarArr[0], this.f9930e);
                    luVar2 = C0320lu.m7915a(lwVarArr[1], this.f9930e);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(lwVarArr));
                    return;
                }
            }
            this.f9923P[i].put("ImageWidth", luVar3);
            this.f9923P[i].put("ImageLength", luVar2);
        } else if (luVar5 == null || luVar6 == null || luVar7 == null || luVar8 == null) {
            C0320lu luVar9 = (C0320lu) this.f9923P[i].get("ImageLength");
            C0320lu luVar10 = (C0320lu) this.f9923P[i].get("ImageWidth");
            if ((luVar9 == null || luVar10 == null) && (luVar = (C0320lu) this.f9923P[i].get("JPEGInterchangeFormat")) != null) {
                m7924a(ltVar, luVar.mo5568b(this.f9930e), i);
            }
        } else {
            int b = luVar5.mo5568b(this.f9930e);
            int b2 = luVar7.mo5568b(this.f9930e);
            int b3 = luVar8.mo5568b(this.f9930e);
            int b4 = luVar6.mo5568b(this.f9930e);
            if (b2 > b && b3 > b4) {
                C0320lu a = C0320lu.m7912a(b2 - b, this.f9930e);
                C0320lu a2 = C0320lu.m7912a(b3 - b4, this.f9930e);
                this.f9923P[i].put("ImageLength", a);
                this.f9923P[i].put("ImageWidth", a2);
            }
        }
    }

    /* renamed from: b */
    private final void m7931b() {
        m7921a(0, 5);
        m7921a(0, 4);
        m7921a(5, 4);
        C0320lu luVar = (C0320lu) this.f9923P[1].get("PixelXDimension");
        C0320lu luVar2 = (C0320lu) this.f9923P[1].get("PixelYDimension");
        if (!(luVar == null || luVar2 == null)) {
            this.f9923P[0].put("ImageWidth", luVar);
            this.f9923P[0].put("ImageLength", luVar2);
        }
        if (this.f9923P[4].isEmpty() && m7927a(this.f9923P[5])) {
            HashMap[] hashMapArr = this.f9923P;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        m7927a(this.f9923P[4]);
    }
}
