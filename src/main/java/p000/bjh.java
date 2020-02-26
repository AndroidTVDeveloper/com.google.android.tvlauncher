package p000;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* renamed from: bjh */
/* compiled from: PG */
public final class bjh extends bho {

    /* renamed from: a */
    private final byte[] f4123a = new byte[2000];

    /* renamed from: b */
    private final DatagramPacket f4124b = new DatagramPacket(this.f4123a, 0, 2000);

    /* renamed from: c */
    private Uri f4125c;

    /* renamed from: d */
    private DatagramSocket f4126d;

    /* renamed from: e */
    private MulticastSocket f4127e;

    /* renamed from: f */
    private InetAddress f4128f;

    /* renamed from: g */
    private InetSocketAddress f4129g;

    /* renamed from: h */
    private boolean f4130h;

    /* renamed from: i */
    private int f4131i;

    public bjh() {
        super(true);
    }

    /* renamed from: a */
    public final Uri mo1500a() {
        return this.f4125c;
    }

    /* renamed from: c */
    public final void mo1503c() {
        this.f4125c = null;
        MulticastSocket multicastSocket = this.f4127e;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f4128f);
            } catch (IOException e) {
            }
            this.f4127e = null;
        }
        DatagramSocket datagramSocket = this.f4126d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f4126d = null;
        }
        this.f4128f = null;
        this.f4129g = null;
        this.f4131i = 0;
        if (this.f4130h) {
            this.f4130h = false;
            mo1944d();
        }
    }

    /* renamed from: a */
    public final long mo1499a(bhy bhy) {
        Uri uri = bhy.f3998a;
        this.f4125c = uri;
        String host = uri.getHost();
        int port = this.f4125c.getPort();
        mo1945e();
        try {
            this.f4128f = InetAddress.getByName(host);
            this.f4129g = new InetSocketAddress(this.f4128f, port);
            if (this.f4128f.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f4129g);
                this.f4127e = multicastSocket;
                multicastSocket.joinGroup(this.f4128f);
                this.f4126d = this.f4127e;
            } else {
                this.f4126d = new DatagramSocket(this.f4129g);
            }
            try {
                this.f4126d.setSoTimeout(8000);
                this.f4130h = true;
                mo1943b(bhy);
                return -1;
            } catch (SocketException e) {
                throw new bjg(e);
            }
        } catch (IOException e2) {
            throw new bjg(e2);
        }
    }

    /* renamed from: a */
    public final int mo1498a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f4131i == 0) {
            try {
                this.f4126d.receive(this.f4124b);
                int length = this.f4124b.getLength();
                this.f4131i = length;
                mo1942a(length);
            } catch (IOException e) {
                throw new bjg(e);
            }
        }
        int length2 = this.f4124b.getLength();
        int i3 = this.f4131i;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f4123a, length2 - i3, bArr, i, min);
        this.f4131i -= min;
        return min;
    }
}
