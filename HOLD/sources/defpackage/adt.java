package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* renamed from: adt  reason: default package */
/* compiled from: PG */
public final class adt implements tz {
    public static final tw a = tw.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new ado());
    private static final tw b = tw.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new adp());
    private final adr c;
    private final xg d;

    public final boolean a(Object obj, tx txVar) {
        return true;
    }

    public adt(xg xgVar, adr adr) {
        this.d = xgVar;
        this.c = adr;
    }

    public final ww a(Object obj, int i, int i2, tx txVar) {
        int i3 = i;
        int i4 = i2;
        tx txVar2 = txVar;
        long longValue = ((Long) txVar2.a(a)).longValue();
        if (longValue < 0 && longValue != -1) {
            StringBuilder sb = new StringBuilder(83);
            sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(longValue);
            throw new IllegalArgumentException(sb.toString());
        }
        Integer num = (Integer) txVar2.a(b);
        if (num == null) {
            num = 2;
        }
        acu acu = (acu) txVar2.a(acu.g);
        if (acu == null) {
            acu = acu.f;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.c.a(mediaMetadataRetriever, obj);
            int intValue = num.intValue();
            Bitmap bitmap = null;
            if (Build.VERSION.SDK_INT >= 27) {
                if (i3 != Integer.MIN_VALUE) {
                    if (!(i4 == Integer.MIN_VALUE || acu == acu.e)) {
                        try {
                            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                            if (parseInt3 != 90) {
                                if (parseInt3 == 270) {
                                }
                                float a2 = acu.a(parseInt, parseInt2, i3, i4);
                                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(((float) parseInt) * a2), Math.round(a2 * ((float) parseInt2)));
                            }
                            int i5 = parseInt2;
                            parseInt2 = parseInt;
                            parseInt = i5;
                            float a22 = acu.a(parseInt, parseInt2, i3, i4);
                            bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(((float) parseInt) * a22), Math.round(a22 * ((float) parseInt2)));
                        } catch (Throwable th) {
                        }
                    }
                }
            }
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
            }
            mediaMetadataRetriever.release();
            return acf.a(bitmap, this.d);
        } catch (RuntimeException e) {
            throw new IOException(e);
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }
}
