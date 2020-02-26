package p000;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* renamed from: adt */
/* compiled from: PG */
public final class adt implements C0541tz {

    /* renamed from: a */
    public static final C0538tw f157a = C0538tw.m8391a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new ado());

    /* renamed from: b */
    private static final C0538tw f158b = C0538tw.m8391a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new adp());

    /* renamed from: c */
    private final adr f159c;

    /* renamed from: d */
    private final C0630xg f160d;

    /* renamed from: a */
    public final boolean mo39a(Object obj, C0539tx txVar) {
        return true;
    }

    public adt(C0630xg xgVar, adr adr) {
        this.f160d = xgVar;
        this.f159c = adr;
    }

    /* renamed from: a */
    public final C0619ww mo38a(Object obj, int i, int i2, C0539tx txVar) {
        int i3 = i;
        int i4 = i2;
        C0539tx txVar2 = txVar;
        long longValue = ((Long) txVar2.mo5987a(f157a)).longValue();
        if (longValue < 0 && longValue != -1) {
            StringBuilder sb = new StringBuilder(83);
            sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(longValue);
            throw new IllegalArgumentException(sb.toString());
        }
        Integer num = (Integer) txVar2.mo5987a(f158b);
        if (num == null) {
            num = 2;
        }
        acu acu = (acu) txVar2.mo5987a(acu.f105g);
        if (acu == null) {
            acu = acu.f104f;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f159c.mo84a(mediaMetadataRetriever, obj);
            int intValue = num.intValue();
            Bitmap bitmap = null;
            if (Build.VERSION.SDK_INT >= 27) {
                if (i3 != Integer.MIN_VALUE) {
                    if (!(i4 == Integer.MIN_VALUE || acu == acu.f103e)) {
                        try {
                            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                            if (parseInt3 != 90) {
                                if (parseInt3 == 270) {
                                }
                                float a = acu.mo55a(parseInt, parseInt2, i3, i4);
                                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(((float) parseInt) * a), Math.round(a * ((float) parseInt2)));
                            }
                            int i5 = parseInt2;
                            parseInt2 = parseInt;
                            parseInt = i5;
                            float a2 = acu.mo55a(parseInt, parseInt2, i3, i4);
                            bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(((float) parseInt) * a2), Math.round(a2 * ((float) parseInt2)));
                        } catch (Throwable th) {
                        }
                    }
                }
            }
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
            }
            mediaMetadataRetriever.release();
            return acf.m107a(bitmap, this.f160d);
        } catch (RuntimeException e) {
            throw new IOException(e);
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }
}
