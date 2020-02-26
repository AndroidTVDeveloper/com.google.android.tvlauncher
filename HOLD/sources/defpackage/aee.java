package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: aee  reason: default package */
/* compiled from: PG */
public final class aee implements tz {
    private static final aed a = new aed();
    private final Context b;
    private final List c;
    private final aed d;
    private final aef e;

    public aee(Context context, List list, xg xgVar, xe xeVar) {
        aed aed = a;
        this.b = context.getApplicationContext();
        this.c = list;
        this.e = new aef(xgVar, xeVar);
        this.d = aed;
    }

    public final /* bridge */ /* synthetic */ ww a(Object obj, int i, int i2, tx txVar) {
        tl tlVar;
        Bitmap.Config config;
        boolean z;
        boolean z2;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        tm a2 = this.d.a(byteBuffer);
        try {
            ahy.a();
            if (a2.b != null) {
                aej aej = null;
                int i3 = 0;
                if (a2.e()) {
                    tlVar = a2.c;
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i4 = 0; i4 < 6; i4++) {
                        sb.append((char) a2.c());
                    }
                    if (sb.toString().startsWith("GIF")) {
                        a2.c.f = a2.d();
                        a2.c.g = a2.d();
                        int c2 = a2.c();
                        tl tlVar2 = a2.c;
                        if ((c2 & 128) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        tlVar2.h = z2;
                        tlVar2.i = (int) Math.pow(2.0d, (double) ((c2 & 7) + 1));
                        a2.c.j = a2.c();
                        a2.c.k = a2.c();
                        if (a2.c.h && !a2.e()) {
                            tl tlVar3 = a2.c;
                            tlVar3.a = a2.a(tlVar3.i);
                            tl tlVar4 = a2.c;
                            tlVar4.l = tlVar4.a[tlVar4.j];
                        }
                    } else {
                        a2.c.b = 1;
                    }
                    if (!a2.e()) {
                        boolean z3 = false;
                        while (true) {
                            if (!z3) {
                                if (a2.e()) {
                                    break;
                                }
                                int c3 = a2.c();
                                if (c3 == 33) {
                                    int c4 = a2.c();
                                    if (c4 == 1) {
                                        a2.a();
                                    } else if (c4 == 249) {
                                        a2.c.d = new tk();
                                        a2.c();
                                        int c5 = a2.c();
                                        tk tkVar = a2.c.d;
                                        int i5 = (c5 & 28) >> 2;
                                        tkVar.g = i5;
                                        if (i5 == 0) {
                                            tkVar.g = 1;
                                        }
                                        tkVar.f = (c5 & 1) != 0;
                                        int d2 = a2.d();
                                        if (d2 < 2) {
                                            d2 = 10;
                                        }
                                        tk tkVar2 = a2.c.d;
                                        tkVar2.i = d2 * 10;
                                        tkVar2.h = a2.c();
                                        a2.c();
                                    } else if (c4 == 254) {
                                        a2.a();
                                    } else if (c4 != 255) {
                                        a2.a();
                                    } else {
                                        a2.b();
                                        StringBuilder sb2 = new StringBuilder();
                                        for (int i6 = 0; i6 < 11; i6++) {
                                            sb2.append((char) a2.a[i6]);
                                        }
                                        if (sb2.toString().equals("NETSCAPE2.0")) {
                                            while (true) {
                                                a2.b();
                                                byte[] bArr = a2.a;
                                                if (bArr[0] == 1) {
                                                    a2.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                                }
                                                if (a2.d > 0) {
                                                    if (a2.e()) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            a2.a();
                                        }
                                    }
                                } else if (c3 == 44) {
                                    tl tlVar5 = a2.c;
                                    if (tlVar5.d == null) {
                                        tlVar5.d = new tk();
                                    }
                                    a2.c.d.a = a2.d();
                                    a2.c.d.b = a2.d();
                                    a2.c.d.c = a2.d();
                                    a2.c.d.d = a2.d();
                                    int c6 = a2.c();
                                    int i7 = c6 & 128;
                                    int pow = (int) Math.pow(2.0d, (double) ((c6 & 7) + 1));
                                    tk tkVar3 = a2.c.d;
                                    if ((c6 & 64) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    tkVar3.e = z;
                                    if (i7 != 0) {
                                        tkVar3.k = a2.a(pow);
                                    } else {
                                        tkVar3.k = null;
                                    }
                                    a2.c.d.j = a2.b.position();
                                    a2.c();
                                    a2.a();
                                    if (!a2.e()) {
                                        tl tlVar6 = a2.c;
                                        tlVar6.c++;
                                        tlVar6.e.add(tlVar6.d);
                                    }
                                } else if (c3 != 59) {
                                    a2.c.b = 1;
                                } else {
                                    z3 = true;
                                }
                            } else {
                                break;
                            }
                        }
                        tl tlVar7 = a2.c;
                        if (tlVar7.c < 0) {
                            tlVar7.b = 1;
                        }
                    }
                    tlVar = a2.c;
                }
                if (tlVar.c > 0 && tlVar.b == 0) {
                    if (txVar.a(aeq.a) != to.b) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = Bitmap.Config.RGB_565;
                    }
                    int min = Math.min(tlVar.g / i2, tlVar.f / i);
                    if (min != 0) {
                        i3 = Integer.highestOneBit(min);
                    }
                    tn tnVar = new tn(this.e, tlVar, byteBuffer, Math.max(1, i3));
                    if (config != Bitmap.Config.ARGB_8888) {
                        if (config != Bitmap.Config.RGB_565) {
                            String valueOf = String.valueOf(config);
                            String valueOf2 = String.valueOf(Bitmap.Config.ARGB_8888);
                            String valueOf3 = String.valueOf(Bitmap.Config.RGB_565);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
                            sb3.append("Unsupported format: ");
                            sb3.append(valueOf);
                            sb3.append(", must be one of ");
                            sb3.append(valueOf2);
                            sb3.append(" or ");
                            sb3.append(valueOf3);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                    }
                    tnVar.j = config;
                    tnVar.a();
                    Bitmap b2 = tnVar.b();
                    if (b2 != null) {
                        aej = new aej(new aeh(this.b, tnVar, acb.b, i, i2, b2));
                    }
                }
                this.d.a(a2);
                return aej;
            }
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } catch (Throwable th) {
            this.d.a(a2);
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, tx txVar) {
        ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) txVar.a(aeq.b)).booleanValue()) {
            return false;
        }
        List list = this.c;
        if (byteBuffer != null) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                ImageHeaderParser$ImageType a2 = ((tr) list.get(i)).a(byteBuffer);
                if (a2 != ImageHeaderParser$ImageType.UNKNOWN) {
                    imageHeaderParser$ImageType = a2;
                    break;
                }
                i++;
            }
        }
        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
        if (imageHeaderParser$ImageType == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }
}
