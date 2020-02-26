package defpackage;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: api  reason: default package */
/* compiled from: PG */
final class api {
    public int A = 1000;
    public int B = 200;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public int M = 1;
    public int N = -1;
    public int O = 8000;
    public long P = 0;
    public long Q = 0;
    public apj R;
    public boolean S;
    public boolean T = true;
    public String U = "eng";
    public aov V;
    public int W;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public byte[] h;
    public aou i;
    public byte[] j;
    public anq k;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = 0;
    public int q = -1;
    public float r = 0.0f;
    public float s = 0.0f;
    public float t = 0.0f;
    public byte[] u = null;
    public int v = -1;
    public boolean w = false;
    public int x = -1;
    public int y = -1;
    public int z = -1;

    private api() {
    }

    public /* synthetic */ api(byte b2) {
    }

    public static Pair a(bky bky) {
        try {
            bky.d(16);
            long i2 = bky.i();
            if (i2 == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (i2 == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (i2 == 826496599) {
                int i3 = bky.b + 20;
                byte[] bArr = bky.a;
                while (true) {
                    int length = bArr.length;
                    if (i3 < length - 4) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1) {
                            if (bArr[i3 + 3] == 15) {
                                return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, i3, length)));
                            }
                        }
                        i3++;
                    } else {
                        throw new ako("Failed to find FourCC VC1 initialization data");
                    }
                }
            } else {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ako("Error parsing FourCC private data");
        }
    }

    public static boolean b(bky bky) {
        try {
            int f2 = bky.f();
            if (f2 == 1) {
                return true;
            }
            if (f2 == 65534) {
                bky.c(24);
                return bky.l() == apk.b.getMostSignificantBits() && bky.l() == apk.b.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ako("Error parsing MS/ACM codec private");
        }
    }

    public static List a(byte[] bArr) {
        byte b2;
        byte b3;
        try {
            if (bArr[0] == 2) {
                int i2 = 1;
                int i3 = 0;
                while (true) {
                    b2 = bArr[i2];
                    if (b2 != -1) {
                        break;
                    }
                    i3 += 255;
                    i2++;
                }
                int i4 = i2 + 1;
                int i5 = i3 + b2;
                int i6 = 0;
                while (true) {
                    b3 = bArr[i4];
                    if (b3 != -1) {
                        break;
                    }
                    i6 += 255;
                    i4++;
                }
                int i7 = i4 + 1;
                int i8 = i6 + b3;
                if (bArr[i7] == 1) {
                    byte[] bArr2 = new byte[i5];
                    System.arraycopy(bArr, i7, bArr2, 0, i5);
                    int i9 = i7 + i5;
                    if (bArr[i9] == 3) {
                        int i10 = i9 + i8;
                        if (bArr[i10] == 5) {
                            int length = bArr.length - i10;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i10, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new ako("Error parsing vorbis codec private");
                    }
                    throw new ako("Error parsing vorbis codec private");
                }
                throw new ako("Error parsing vorbis codec private");
            }
            throw new ako("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ako("Error parsing vorbis codec private");
        }
    }
}
