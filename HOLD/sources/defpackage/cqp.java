package defpackage;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.tv.TvContract;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ChannelView;
import com.google.android.tvlauncher.home.view.ConfigureChannelsRowView;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;
import com.google.android.tvlauncher.notifications.NotificationsTrayView;
import com.google.android.tvlauncher.view.HomeTopRowView;
import com.google.android.tvlauncher.view.SearchView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: cqp  reason: default package */
/* compiled from: PG */
public final class cqp extends jp implements AccessibilityManager.AccessibilityStateChangeListener, ddm, cex, cew, cez, cey, cit, ddn {
    public boolean A;
    public final Handler B = new Handler();
    public long C;
    public boolean D;
    public final IntentFilter E = new IntentFilter();
    public boolean F;
    public final cox G;
    public final Handler H = new Handler();
    public final Runnable I = new cqf(this);
    public final Runnable J = new cqg(this);
    public final BroadcastReceiver K = new cqh(this);
    public final ckg L = new ckg(this);
    public final Runnable M = new cpu(this);
    public final Runnable N = new cpw(this);
    public final Runnable O = new cpx(this);
    public final Runnable P = new cpy(this);
    public final Runnable Q = new cqi(this);
    public final cle R;
    private Cursor S = null;
    private final Set T;
    private final Set U;
    private boolean V = false;
    private Drawable W;
    private String[] X;
    private ddw Y;
    private int Z;
    private boolean aa;
    private final dbj ab;
    private final Runnable ac = new cpv(this);
    private final Runnable ad = new cpz(this);
    private final Runnable ae = new cqj(this);
    private final Runnable af;
    private final SharedPreferences.OnSharedPreferenceChangeListener ag;
    private final crk ah;
    private final csf ai;
    public final Context b;
    public final cla c;
    public final cfp d;
    public VerticalGridView e;
    public cpt f;
    public cew g;
    public sx h;
    public final int i;
    public final ny j;
    public final ny k;
    public final ny l;
    public final ny m;
    public final ny n;
    public final ny o;
    public int p = 0;
    public final HashSet q = new HashSet();
    public int r = 1;
    public long s;
    public boolean t;
    public boolean u;
    public crz v;
    public cse w;
    public final Set x = new HashSet();
    public final Set y = new HashSet();
    public Cursor z = null;

    public cqp(Context context, cfp cfp, cla cla, cox cox) {
        new cqk(this);
        this.af = new cql(this);
        this.ag = new cqm(this);
        this.R = new cqc(this);
        this.ah = new cqd(this);
        this.ai = new cqe(this);
        this.b = context;
        this.d = cfp;
        this.c = cla;
        this.G = cox;
        this.ab = ((cgg) context.getApplicationContext()).e();
        this.E.addAction("android.intent.action.TIME_SET");
        this.E.addAction("android.intent.action.DATE_CHANGED");
        this.E.addAction("android.intent.action.TIMEZONE_CHANGED");
        this.i = context.getResources().getDimensionPixelSize(R.dimen.channel_items_list_keyline);
        this.j = l(R.dimen.channel_items_list_apps_row_zoomed_out_notif_tray_keyline_offset);
        this.k = l(R.dimen.channel_items_list_apps_row_notif_tray_keyline_offset);
        this.l = l(R.dimen.channel_items_list_sponsored_channel_keyline_offset);
        this.m = dbq.a(context.getResources().getDimensionPixelSize(R.dimen.home_configure_channels_keyline_offset), Integer.valueOf((int) R.id.button));
        this.n = l(R.dimen.channel_items_list_second_to_last_row_zoomed_out_keyline_offset);
        this.o = l(R.dimen.channel_items_list_third_to_last_row_zoomed_out_keyline_offset);
        a(true);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
        dck.a(context);
        this.t = sharedPreferences.getBoolean("show_watch_next_row_key", dck.m());
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.ag);
        if (!ddc.a) {
            Resources resources = context.getResources();
            si.a(context).c.a(Bitmap.class, dcz.class, new ddb(context));
            si.a(context).c.a(Bitmap.class, cjj.class, new cjl(context, dcy.a(resources, (int) R.dimen.install_banner_darken_factor), dcy.a(resources, (int) R.dimen.gray_scale_saturation)));
            ddc.a = true;
        }
        this.T = dbk.a(context.getContentResolver(), "tvlauncher:blacklisted_from_watchlist");
        this.U = dbk.a(context.getContentResolver(), "tvlauncher:blacklisted_from_removal");
        g();
        if (this.t) {
            f();
        }
        this.A = true;
        i();
    }

    public static int a(int i2, boolean z2) {
        if (!z2) {
            return i2;
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return 0;
        }
        return i2;
    }

    public static boolean f(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    private final int m() {
        return this.u ? 3 : 2;
    }

    public final void a(boolean z2, Pair pair) {
    }

    public final void b(ArrayList arrayList) {
    }

    private final ny l(int i2) {
        return dbq.a(this.b.getResources().getDimensionPixelSize(i2), Integer.valueOf((int) R.id.items_list));
    }

    public final int j(int i2) {
        return i2 + m();
    }

    public final int h() {
        if (this.c.g()) {
            return this.c.h();
        }
        return 0;
    }

    public final int k(int i2) {
        return i2 - m();
    }

    private final int c(int i2, boolean z2) {
        int m2 = m(i2);
        if (!z2) {
            return m2;
        }
        switch (m2) {
            case 0:
                return 18;
            case 1:
                return 19;
            case 2:
                return 20;
            case 3:
                return 21;
            case 4:
                return 22;
            case 5:
                return 23;
            case 6:
            case 13:
            case 15:
            default:
                String a = ChannelView.a(m2);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 47);
                sb.append("Unsupported ChannelView state ");
                sb.append(a);
                sb.append(" when it is empty");
                throw new IllegalStateException(sb.toString());
            case 7:
                return 24;
            case 8:
                return 25;
            case 9:
                return 26;
            case 10:
                return 27;
            case 11:
                return 28;
            case 12:
                return 29;
            case 14:
                return 30;
            case 16:
                return 31;
            case 17:
                return 32;
        }
    }

    public final cqz g(int i2) {
        cqo cqo = (cqo) this.e.e(i2);
        if (cqo != null) {
            return cqo.p;
        }
        return null;
    }

    public final int a() {
        return h() + m() + 1;
    }

    public final long b(int i2) {
        switch (a(i2)) {
            case 0:
                return -2;
            case 1:
                return -3;
            case 2:
                return -4;
            case 3:
            case 4:
            case 5:
                return this.c.b(k(i2)).a;
            case 6:
                return -5;
            default:
                return -1;
        }
    }

    public final int a(int i2) {
        if (i2 == a() - 1) {
            return 6;
        }
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2 && this.u) {
            return 2;
        }
        cxt b2 = this.c.b(k(i2));
        if (b2.g) {
            return b2.h != 2 ? 4 : 5;
        }
        return 3;
    }

    private final int m(int i2) {
        int i3 = this.r;
        int i4 = this.p;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    return i3 != i2 ? 14 : 13;
                }
                if (i4 == 3) {
                    return i3 != i2 ? 16 : 15;
                }
                if (!(i4 == 4 || i4 == 5)) {
                    return 1;
                }
            } else if (i3 != i2) {
                return (i3 == 0 && i2 > 0 && i2 <= 4) ? 12 : 11;
            } else {
                return 10;
            }
        }
        if (i4 == 4 && a(i2) == 1) {
            return 6;
        }
        if (this.p == 5 && i2 <= 3 && a(i2) != 6) {
            return 5;
        }
        if (this.w.b && h(i2)) {
            return i3 != i2 ? 9 : 8;
        }
        if (i3 == i2) {
            return 0;
        }
        if (this.r == 0 && ((i2 == 2 || i2 == 3) && a(i2) != 6)) {
            return 4;
        }
        if (this.r == 1 && ((i2 == 2 || i2 == 3) && a(i2) != 6)) {
            return 7;
        }
        if (this.r == a() - 1 && i2 == a() - 2) {
            return 17;
        }
        int i5 = this.r;
        if (i2 == i5 - 1 || (i5 == a() - 1 && i2 == a() - 3 && a(i2) != 0)) {
            return 2;
        }
        if (i2 == this.r + 1 && i2 > 2) {
            return 3;
        }
        return 1;
    }

    private final cqz k() {
        return g(this.r);
    }

    public final boolean h(int i2) {
        return i2 > 3 && i2 < a() + -3;
    }

    public final void a(int i2, cek cek) {
        cfs cfs = new cfs(i2, (byte) 0);
        cfs.b(cek);
        this.d.a(cfs);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cqp.a(int, boolean):int
     arg types: [int, int]
     candidates:
      cqp.a(cqo, int):void
      cqp.a(android.view.ViewGroup, int):km
      cqp.a(int, cek):void
      cqp.a(km, int):void
      cqp.a(boolean, android.util.Pair):void
      jp.a(android.view.ViewGroup, int):km
      jp.a(int, int):void
      jp.a(int, java.lang.Object):void
      jp.a(km, int):void
      cit.a(boolean, android.util.Pair):void
      cqp.a(int, boolean):int */
    public final void onAccessibilityStateChanged(boolean z2) {
        int a;
        a(0, "PAYLOAD_NOTIF_TRAY_CURSOR");
        if (z2 && (a = a(this.p, true)) != this.p) {
            this.p = a;
            a(0, a(), "PAYLOAD_STATE");
        }
    }

    public final void a(Context context) {
        if (this.e.r() != 1) {
            l();
        }
    }

    public final void b(Context context) {
        cqz k2 = k();
        if (k2 instanceof cex) {
            ((cex) k2).b(context);
        } else {
            a(context);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cst.a(int, boolean):void
     arg types: [int, int]
     candidates:
      cst.a(android.view.ViewGroup, int):km
      cst.a(km, int):void
      jp.a(android.view.ViewGroup, int):km
      jp.a(int, int):void
      jp.a(int, java.lang.Object):void
      jp.a(km, int):void
      cst.a(int, boolean):void */
    public final /* bridge */ /* synthetic */ void a(km kmVar, int i2, List list) {
        cqo cqo = (cqo) kmVar;
        if (list.isEmpty()) {
            a(cqo, i2);
            return;
        }
        int a = a(i2);
        if (list.contains("PAYLOAD_CHANNEL_ITEM_METADATA")) {
            if (a == 3) {
                ((cor) cqo.p).e();
            } else if (a == 2) {
                ((csu) cqo.p).c();
            }
        }
        boolean z2 = false;
        if (a == 2 && (list.contains("PAYLOAD_WATCH_NEXT_CARD_SELECTION_CHANGED") || list.contains("PAYLOAD_WATCH_NEXT_DATA_CHANGED"))) {
            csu csu = (csu) cqo.p;
            boolean z3 = csu.e.a() > 0 && csu.e.a(csu.b.r()) == 1;
            ChannelView channelView = csu.a;
            if (z3) {
                if (channelView.z) {
                    channelView.a(false);
                }
                channelView.a(true);
            } else {
                channelView.a(false);
            }
        }
        if (list.contains("PAYLOAD_STATE")) {
            if (a == 2) {
                csu csu2 = (csu) cqo.p;
                int m2 = m(i2);
                if (csu2.a.A != m2 && csu2.f.b && csu2.b.r() == 0) {
                    csu2.f.b(!csu2.g);
                }
                csu2.a.b(m2);
                int i3 = csu2.e.d;
                int a2 = csu.a(m2);
                csu2.e.a(a2, true);
                csu2.a(a2, i3);
                this.y.add(csu2);
            } else if (a == 3 || a == 4 || a == 5) {
                cor cor = (cor) cqo.p;
                long j2 = this.c.b(k(i2)).a;
                boolean a3 = this.c.a(j2);
                cor.a(c(i2, a3));
                if (a3) {
                    cox cox = this.G;
                    if (this.r == i2) {
                        z2 = true;
                    }
                    cox.a(j2, z2);
                }
                this.x.add(cor);
            } else if (a == 0) {
                HomeTopRowView homeTopRowView = (HomeTopRowView) cqo.p.a();
                if (this.r == i2) {
                    z2 = true;
                }
                homeTopRowView.c(z2);
            } else {
                a(cqo, i2);
            }
        }
        if (list.contains("PAYLOAD_FAST_SCROLLING")) {
            if (a == 1 || a == 2 || a == 3 || a == 4 || a == 5) {
                cqo.p.a(this.w.b);
            }
            if (a == 3 || a == 4 || a == 5) {
                ((cor) cqo.p).a(c(i2, this.c.a(this.c.b(k(i2)).a)));
            }
        }
        if (list.contains("PAYLOAD_CHANNEL_MOVE_ACTION") && (a == 3 || a == 4 || a == 5)) {
            ((cor) cqo.p).c();
        }
        if (list.contains("PAYLOAD_CHANNEL_LOGO_TITLE") && a == 3) {
            ((cor) cqo.p).d();
        }
        if (a == 0) {
            HomeTopRowView homeTopRowView2 = (HomeTopRowView) cqo.p.a();
            SearchView searchView = homeTopRowView2.e;
            if (searchView != null) {
                if (list.contains("PAYLOAD_IDLE_STATE")) {
                    searchView.a(this.V);
                }
                if (list.contains("PAYLOAD_ASSISTANT_ICON")) {
                    searchView.a(this.W);
                }
                if (list.contains("PAYLOAD_ASSISTANT_SUGGESTIONS")) {
                    searchView.a(this.X);
                }
                if (list.contains("PAYLOAD_MIC_STATUS")) {
                    searchView.a(this.Z);
                }
                if (list.contains("PAYLOAD_HOTWORD_STATUS")) {
                    searchView.b(this.aa);
                }
            }
            if (list.contains("PAYLOAD_PARTNER_WIDGET_INFO")) {
                homeTopRowView2.a(this.Y);
            }
            if (list.contains("PAYLOAD_NOTIF_COUNT_CURSOR")) {
                homeTopRowView2.g.a(this.S);
            }
            if (list.contains("PAYLOAD_NOTIF_TRAY_CURSOR")) {
                homeTopRowView2.c().a(this.z);
                homeTopRowView2.b();
            }
            if (list.contains("PAYLOAD_INPUT_ICON_VISIBILITY")) {
                homeTopRowView2.b(this.F);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void a(cqo cqo, int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        dad dad;
        int i3;
        cqo cqo2 = cqo;
        int i4 = i2;
        int a = a(i4);
        int i5 = this.r;
        int i6 = 0;
        if (i5 == i4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a == 2) {
            csu csu = (csu) cqo2.p;
            int m2 = m(i4);
            if (csu.e == null) {
                csu.e = new cst(csu.a.getContext(), csu.c);
                cst cst = csu.e;
                cst.f = csu.h;
                cst.g = csu;
                cst.h = csu;
                cst.i = csu.k;
                csu.b.a(cst);
                csu.f = new cse(csu.b, new ctv());
                cse cse = csu.f;
                cse.a = 550;
                cse.g = csu;
                csu.b();
                csu.d = new csl(csu.a.r);
            }
            csu.a.b(m2);
            int i7 = csu.e.d;
            int a2 = csu.a(m2);
            cst cst2 = csu.e;
            cst2.d = a2;
            if (!cst2.d()) {
                cst2.e = -1;
                cst2.O();
            }
            cst2.j = true;
            csu.a(a2, i7);
            if (m2 == 0) {
                csu.c();
            }
            csu.a(this.w.b);
            this.y.add(csu);
        } else if (a == 1) {
            cpq cpq = (cpq) cqo2.p;
            int m3 = m(i4);
            if (cpq.d == null) {
                cpq.d = new cpo(cpq.a.getContext(), cpq.c);
                cpo cpo = cpq.d;
                cpo.s = cpq.f;
                cpo.t = cpq;
                cpo.u = cpq;
                cpo.v = cpq;
                cpo.w = cpq.i;
                cpq.b.a(cpo);
                cpq.e = new cse(cpq.b, new ctv());
                cpq.b();
            }
            cpq.a.b(m3);
            cpo cpo2 = cpq.d;
            int i8 = cpo2.c;
            switch (m3) {
                case 0:
                    i3 = 2;
                    break;
                case 1:
                    i3 = 0;
                    break;
                case 2:
                case 17:
                    i3 = 1;
                    break;
                case 3:
                case 4:
                case 7:
                case 8:
                case 9:
                case 13:
                case 15:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                    String valueOf = String.valueOf(ChannelView.a(m3));
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported Apps row state ") : "Unsupported Apps row state ".concat(valueOf));
                case 5:
                    i3 = 9;
                    break;
                case 6:
                    i3 = 8;
                    break;
                case 10:
                    i3 = 4;
                    break;
                case 11:
                    i3 = 3;
                    break;
                case 12:
                    i3 = 5;
                    break;
                case 14:
                    i3 = 6;
                    break;
                case 16:
                    i3 = 7;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            if (i8 != i3) {
                cpo2.c = i3;
                cpo2.d = -1;
                cpo2.a(0, cpo2.a(), "PAYLOAD_STATE");
            }
            if (i3 != i8 && ((i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6 || i3 == 7) && cpq.d.a() > 1 && cpq.b.r() != 0)) {
                cpq.b.k(0);
            }
            cpq.a(this.w.b);
            if (this.D && i4 == this.r) {
                cpq.c();
                this.D = false;
            }
        } else if (a == 6) {
            cov cov = (cov) cqo2.p;
            int i9 = this.p;
            int a3 = a(i4 - 1);
            int i10 = cov.g;
            int i11 = cov.d;
            if (i9 != 0) {
                if (i9 == 1) {
                    i10 = cov.h;
                } else if (i9 == 2) {
                    i10 = cov.i;
                } else if (i9 == 3) {
                    i10 = cov.j;
                }
                i11 = cov.f;
            } else if (a3 == 1) {
                i11 = cov.e;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cov.a.getLayoutParams();
            marginLayoutParams.setMarginStart(i10);
            cov.a.setLayoutParams(marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) cov.b.getLayoutParams();
            marginLayoutParams2.topMargin = i11;
            cov.b.setLayoutParams(marginLayoutParams2);
            if (z2) {
                cov.b.setBackgroundColor(cov.l);
                cov.b.setScaleX(cov.k);
                cov.b.setScaleY(cov.k);
            } else {
                cov.b.setBackgroundColor(cov.m);
                cov.b.setScaleX(1.0f);
                cov.b.setScaleY(1.0f);
            }
            int i12 = cov.b.getLayoutParams().width;
            int i13 = cov.b.getLayoutParams().height;
            if (i12 <= 0 || i13 <= 0) {
                i12 = cov.b.getWidth();
                i13 = cov.b.getHeight();
            }
            if (i12 > 0 && i13 > 0) {
                if (cov.b.getLayoutDirection() == 1) {
                    cov.b.setPivotX((float) i12);
                } else {
                    cov.b.setPivotX(0.0f);
                }
                cov.b.setPivotY((float) i13);
            }
            ConfigureChannelsRowView configureChannelsRowView = cov.a;
            if (i5 != i4) {
                i6 = 4;
            }
            configureChannelsRowView.c = i6;
            configureChannelsRowView.b.setVisibility(i6);
        } else if (a == 3 || a == 4 || a == 5) {
            cor cor = (cor) cqo2.p;
            cxt b2 = this.c.b(k(i4));
            long j2 = b2.a;
            boolean a4 = this.c.a(j2);
            int c2 = c(i4, a4);
            boolean z6 = !this.T.contains(b2.f);
            boolean z7 = !this.U.contains(b2.f);
            long j3 = cor.f;
            cor.f = b2.a;
            cor.h = b2.c;
            cor.g = b2.b;
            cor.i = b2.f;
            cor.l = b2.k;
            cor.v = b2.i;
            cor.w = b2.j;
            if (cor.m == null) {
                cor.m = new coo(cor.a.getContext(), cor);
                coo coo = cor.m;
                boolean z8 = cor.t;
                boolean z9 = cor.u;
                coo.m = z8;
                coo.n = z9;
                coo.g = cor.o;
                coo.h = cor;
                coo.i = cor;
                coo.j = cor.r;
                cor.b.a(coo);
                cor.n = new cse(cor.b, new ctv());
                cor.n.g = cor;
                cor.b();
            }
            dad dad2 = cor.s;
            if (!(dad2 == null || cor.f == j3)) {
                dad2.b();
            }
            cok cok = cor.d;
            boolean z10 = cor.l;
            cok.F = z10;
            ChannelView channelView = cor.a;
            channelView.B = cor.v;
            channelView.C = cor.w;
            if (!z10 && !cor.t) {
                z4 = z6;
                z3 = z7;
            } else {
                z4 = false;
                z3 = false;
            }
            if (!cor.t) {
                z5 = false;
                cor.d();
            } else if (cor.u) {
                z5 = false;
                channelView.b(String.format(cor.j, b2.e));
            } else {
                z5 = false;
            }
            if (!cor.t || cor.u) {
                cor.a.c(cor.g);
                cor.a.g.setText(cor.g);
            }
            cor.c();
            if (!dcy.a(c2) || (dad = cor.s) == null || !dad.h) {
                cor.h();
            } else {
                dad.b();
            }
            if (!cor.t || cor.u) {
                cla a5 = cla.a(cor.a.getContext());
                Long valueOf2 = Long.valueOf(b2.a);
                Uri uri = (Uri) a5.i.get(valueOf2);
                if (uri == null) {
                    uri = TvContract.buildChannelLogoUri(valueOf2.longValue()).buildUpon().appendQueryParameter("t", String.valueOf(System.currentTimeMillis())).build();
                    a5.i.put(valueOf2, uri);
                }
                su d2 = cor.c.d();
                d2.a(uri);
                su d3 = cor.c.d();
                d3.a(cor.k);
                d2.a = d3;
                d2.a((ahg) cor.e);
                cor.k = uri;
            }
            cor.a.b(c2);
            int i14 = cor.m.e;
            int b3 = cor.b(c2);
            cor.m.a(b2.a, cor.i, b3, z4, z3, cor.l);
            cor.a(b3, i14);
            if (c2 == 0) {
                cor.e();
            }
            if (a4) {
                cox cox = this.G;
                if (this.r == i4) {
                    z5 = true;
                }
                cox.a(j2, z5);
            }
            cor.a(this.w.b);
            this.x.add(cor);
        } else if (a == 0) {
            HomeTopRowView homeTopRowView = (HomeTopRowView) cqo2.p.a();
            homeTopRowView.c().a(this.z);
            homeTopRowView.g.a(this.S);
            homeTopRowView.b();
            homeTopRowView.c(z2);
            SearchView searchView = homeTopRowView.e;
            searchView.a(this.V);
            searchView.a(this.W);
            searchView.a(this.X);
            searchView.a(this.Z);
            searchView.b(this.aa);
            homeTopRowView.a(this.Y);
            homeTopRowView.b(this.F);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ km a(ViewGroup viewGroup, int i2) {
        boolean z2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 0) {
            HomeTopRowView homeTopRowView = (HomeTopRowView) from.inflate((int) R.layout.home_top_row, viewGroup, false);
            homeTopRowView.h = this;
            homeTopRowView.c = this.d;
            homeTopRowView.j = this;
            cyl cyl = new cyl(viewGroup.getContext(), this.d);
            viewGroup.getContext();
            cyt cyt = new cyt(this.d, this.z);
            NotificationsTrayView notificationsTrayView = homeTopRowView.f;
            notificationsTrayView.a.a(cyt);
            notificationsTrayView.a();
            homeTopRowView.g = cyl;
            NotificationsPanelButtonView notificationsPanelButtonView = (NotificationsPanelButtonView) homeTopRowView.findViewById(R.id.notification_panel_button);
            cyl cyl2 = homeTopRowView.g;
            if (notificationsPanelButtonView != null) {
                cyl2.c = notificationsPanelButtonView;
                cyl2.c.setOnClickListener(new cyk(cyl2));
                cyl2.a();
            }
            return new cqo(this, homeTopRowView);
        } else if (i2 == 1) {
            ChannelView channelView = (ChannelView) from.inflate((int) R.layout.home_channel_row, viewGroup, false);
            channelView.setId(R.id.apps_row);
            cpq cpq = new cpq(channelView, this.d);
            cpq.g = this;
            cpq.h = this;
            cpq.i = this.ai;
            return new cqo(this, cpq);
        } else if (i2 == 2) {
            csu csu = new csu((ChannelView) from.inflate((int) R.layout.home_channel_row, viewGroup, false), this.d);
            csu.h = this.ah;
            csu.i = this;
            csu.j = this;
            csu.k = this.ai;
            return new cqo(this, csu);
        } else if (i2 == 6) {
            return new cqo(this, new cov((ConfigureChannelsRowView) from.inflate((int) R.layout.home_configure_channels_row, viewGroup, false)));
        } else {
            ChannelView channelView2 = (ChannelView) from.inflate((int) R.layout.home_channel_row, viewGroup, false);
            cqn cqn = new cqn(this);
            sx sxVar = this.h;
            cla cla = this.c;
            if (cla.g()) {
                cjs cjs = cla.w;
                cok cok = new cok(channelView2.r);
                dbj dbj = this.ab;
                boolean z3 = i2 == 4 || i2 == 5;
                if (i2 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                cor cor = new cor(channelView2, sxVar, cqn, cjs, cok, dbj, z3, z2);
                cor.o = this.ah;
                cor.p = this;
                cor.q = this;
                cor.r = this.ai;
                cqo cqo = new cqo(this, cor);
                cqn.a = cqo;
                return cqo;
            }
            throw new IllegalStateException("Home channel data not loaded yet");
        }
    }

    public final /* bridge */ /* synthetic */ void c(km kmVar) {
        cqo cqo = (cqo) kmVar;
        String valueOf = String.valueOf(cqo);
        String valueOf2 = String.valueOf(cqo.p);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29 + String.valueOf(valueOf2).length());
        sb.append("onFailedToRecycleView: h=");
        sb.append(valueOf);
        sb.append(", r=");
        sb.append(valueOf2);
        Log.w("HomeController", sb.toString());
    }

    public final void c(Context context) {
        if (this.e.r() != 1) {
            l();
        }
    }

    public final void d(Context context) {
        if (SystemClock.elapsedRealtime() - this.C <= 200) {
            cqz k2 = k();
            if (k2 instanceof cez) {
                ((cez) k2).d(context);
            } else {
                c(context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Boolean bool) {
        this.aa = bool != null ? bool.booleanValue() : false;
        a(0, "PAYLOAD_HOTWORD_STATUS");
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z2) {
        this.V = z2;
        this.B.removeCallbacks(this.ad);
        this.B.postDelayed(this.ad, 500);
    }

    public final void i(int i2) {
        int i3;
        this.G.a();
        int a = a() - 1;
        int i4 = this.r;
        if (i4 > i2) {
            this.r = i4 - 1;
        }
        long j2 = this.s;
        i();
        if (j2 != this.s && ((i3 = this.p) == 3 || i3 == 2)) {
            this.p = 1;
        }
        if (this.p == 1 && dcy.b(this.b)) {
            this.p = 0;
        }
        e(i2);
        a(0, a(), "PAYLOAD_STATE");
        int m2 = m();
        if (i2 == m2 && i2 != a) {
            a(i2, "PAYLOAD_CHANNEL_MOVE_ACTION");
        }
        if (i2 == a && i2 != m2) {
            a(i2 - 1, "PAYLOAD_CHANNEL_MOVE_ACTION");
        }
    }

    public final void a(ArrayList arrayList) {
        a(m(), a(), "PAYLOAD_CHANNEL_LOGO_TITLE");
    }

    public final void d() {
        a(m(), a(), "PAYLOAD_CHANNEL_LOGO_TITLE");
    }

    /* access modifiers changed from: package-private */
    public final void a(Integer num) {
        this.Z = num != null ? num.intValue() : 0;
        a(0, "PAYLOAD_MIC_STATUS");
    }

    /* access modifiers changed from: package-private */
    public final void a(ddw ddw) {
        this.Y = ddw;
        a(0, "PAYLOAD_PARTNER_WIDGET_INFO");
    }

    /* access modifiers changed from: package-private */
    public final void a(Drawable drawable) {
        this.W = drawable;
        a(0, "PAYLOAD_ASSISTANT_ICON");
    }

    /* access modifiers changed from: package-private */
    public final void a(String[] strArr) {
        this.X = strArr;
        a(0, "PAYLOAD_ASSISTANT_SUGGESTIONS");
    }

    public final void j() {
        a(32, dhs.x);
        try {
            this.b.startActivity(new Intent("android.settings.SETTINGS"));
        } catch (ActivityNotFoundException e2) {
            Log.e("HomeController", "Exception starting settings", e2);
            Context context = this.b;
            Toast.makeText(context, context.getString(R.string.app_unavailable), 0).show();
        }
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar) {
        cqz cqz = ((cqo) kmVar).p;
        if (cqz instanceof cor) {
            cor cor = (cor) cqz;
            coo coo = cor.m;
            coo.a(-1, null, coo.e, false, false, false);
            coo.l = false;
            coo.f = -1;
            coo.O();
            cor.b.i(0);
            ChannelView channelView = cor.a;
            channelView.h.setImageDrawable(null);
            channelView.a(false);
            cor.d.a();
            cor.k = null;
            dad dad = cor.s;
            if (dad != null) {
                dad.b();
            }
            this.x.remove(cor);
        } else if (cqz instanceof csu) {
            csu csu = (csu) cqz;
            cst cst = csu.e;
            cst.e = -1;
            cst.e();
            csu.d.a();
            this.y.remove(csu);
        } else if (cqz instanceof HomeTopRowView) {
            ((HomeTopRowView) cqz).c().a((Cursor) null);
        }
    }

    public final void g() {
        cla cla = this.c;
        ckg ckg = this.L;
        if (!cla.b.contains(ckg)) {
            cla.b.add(ckg);
        }
        cla.b();
        if (!this.c.g() || this.c.n) {
            this.c.k();
        }
    }

    public final void f() {
        this.c.a(this.R);
        if (!this.c.i() || this.c.t) {
            this.c.n();
            this.c.o();
            return;
        }
        e();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cqp.b(int, boolean):void
     arg types: [int, int]
     candidates:
      jp.b(int, int):void
      cqp.b(int, boolean):void */
    private final void l() {
        this.D = true;
        if (this.e.r() > 6 || dcy.d(this.b)) {
            this.e.suppressLayout(true);
            this.e.i(1);
            b(1, true);
            this.e.suppressLayout(false);
            return;
        }
        this.e.j(1);
    }

    public final void b(int i2, boolean z2) {
        if (this.r != i2) {
            if (this.p != 0 || !this.w.b || !h(i2)) {
                if (this.r >= m() && this.r < a() - 1 && this.c.a(this.s)) {
                    this.B.post(new cqb(this, this.s));
                }
                int i3 = this.p;
                if ((i3 == 0 || i3 == 1) && z2) {
                    this.q.add(Integer.valueOf(this.r));
                    this.r = i2;
                    i();
                    this.B.removeCallbacks(this.ac);
                    if (this.e.l()) {
                        Log.w("HomeController", "setSelectedPosition: still computing layout => scheduling");
                        this.B.post(this.ac);
                    } else {
                        this.ac.run();
                    }
                } else {
                    this.r = i2;
                    i();
                }
                if (this.r <= 1 && this.f != null) {
                    this.B.postDelayed(this.ae, 2000);
                } else {
                    this.B.removeCallbacks(this.ae);
                }
            } else {
                this.r = i2;
                i();
            }
            if (this.D && i2 == 1) {
                this.B.removeCallbacks(this.af);
                if (dcy.b(this.b)) {
                    this.B.postDelayed(this.af, 50);
                } else {
                    this.af.run();
                }
            }
        }
    }

    public final void b(boolean z2) {
        if (this.u != z2) {
            this.u = z2;
            if (!z2) {
                int i2 = this.r;
                if (i2 > 2) {
                    this.r = i2 - 1;
                }
                e(2);
                a(0, a(), "PAYLOAD_STATE");
            } else {
                int i3 = this.r;
                if (i3 >= 2) {
                    this.r = i3 + 1;
                }
                d(2);
                a(0, a(), "PAYLOAD_STATE");
            }
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Cursor cursor) {
        Cursor cursor2 = this.z;
        this.z = cursor;
        if (cursor2 != null) {
            cursor2.close();
        }
        a(0, "PAYLOAD_NOTIF_TRAY_CURSOR");
    }

    /* access modifiers changed from: package-private */
    public final void b(Cursor cursor) {
        this.S = cursor;
        a(0, "PAYLOAD_NOTIF_COUNT_CURSOR");
    }

    public final void i() {
        this.s = b(Math.min(this.r, a() - 1));
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        boolean z2;
        if (this.c.j() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        b(z2);
    }
}
