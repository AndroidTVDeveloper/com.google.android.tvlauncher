package defpackage;

import java.nio.ByteBuffer;

/* renamed from: amv  reason: default package */
/* compiled from: PG */
public final class amv {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static boolean a(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static int b(byte[] bArr) {
        int i;
        boolean z = false;
        byte b2 = bArr[0];
        if (b2 == -2) {
            i = (((bArr[6] & 240) >> 4) | ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4)) + 1;
        } else if (b2 == -1) {
            i = (((bArr[9] & 60) >> 2) | ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4)) + 1;
            z = true;
        } else if (b2 != 31) {
            i = (((bArr[7] & 240) >> 4) | ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4)) + 1;
        } else {
            i = (((bArr[8] & 60) >> 2) | ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4)) + 1;
            z = true;
        }
        return z ? (i << 4) / 14 : i;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        byte b2 = byteBuffer.get(position);
        if (b2 == -2) {
            i = ((byteBuffer.get(position + 4) & 252) >> 2) | ((byteBuffer.get(position + 5) & 1) << 6);
        } else if (b2 == -1) {
            i = ((byteBuffer.get(position + 7) & 60) >> 2) | ((byteBuffer.get(position + 4) & 7) << 4);
        } else if (b2 != 31) {
            i = ((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6);
        } else {
            i = ((byteBuffer.get(position + 6) & 60) >> 2) | ((byteBuffer.get(position + 5) & 7) << 4);
        }
        return (i + 1) << 5;
    }

    public static int a(byte[] bArr) {
        int i;
        byte b2 = bArr[0];
        if (b2 == -2) {
            i = ((bArr[4] & 252) >> 2) | ((bArr[5] & 1) << 6);
        } else if (b2 == -1) {
            i = ((bArr[7] & 60) >> 2) | ((bArr[4] & 7) << 4);
        } else if (b2 != 31) {
            i = ((bArr[5] & 252) >> 2) | ((bArr[4] & 1) << 6);
        } else {
            i = ((bArr[6] & 60) >> 2) | ((bArr[5] & 7) << 4);
        }
        return (i + 1) << 5;
    }
}
