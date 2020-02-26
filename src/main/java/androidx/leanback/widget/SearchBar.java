package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class SearchBar extends RelativeLayout {

    /* renamed from: a */
    public SearchEditText f1246a;

    /* renamed from: b */
    public SpeechOrbView f1247b;

    /* renamed from: c */
    public String f1248c;

    /* renamed from: d */
    public final Handler f1249d;

    /* renamed from: e */
    public boolean f1250e;

    /* renamed from: f */
    private String f1251f;

    /* renamed from: g */
    private final InputMethodManager f1252g;

    /* renamed from: h */
    private Drawable f1253h;

    /* renamed from: i */
    private final int f1254i;

    /* renamed from: j */
    private final int f1255j;

    /* renamed from: k */
    private final int f1256k;

    /* renamed from: l */
    private final int f1257l;

    /* renamed from: m */
    private int f1258m;

    /* renamed from: n */
    private int f1259n;

    /* renamed from: o */
    private SoundPool f1260o;

    /* renamed from: p */
    private SparseIntArray f1261p;

    /* renamed from: q */
    private final Context f1262q;

    static {
        SearchBar.class.getSimpleName();
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, androidx.leanback.widget.SearchBar, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1249d = new Handler();
        this.f1250e = false;
        this.f1261p = new SparseIntArray();
        this.f1262q = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate((int) R.layout.lb_search_bar, (ViewGroup) this, true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.lb_search_bar_height));
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.f1248c = "";
        this.f1252g = (InputMethodManager) context.getSystemService("input_method");
        this.f1255j = resources.getColor(R.color.lb_search_bar_text_speech_mode);
        this.f1254i = resources.getColor(R.color.lb_search_bar_text);
        this.f1259n = resources.getInteger(R.integer.lb_search_bar_speech_mode_background_alpha);
        this.f1258m = resources.getInteger(R.integer.lb_search_bar_text_mode_background_alpha);
        this.f1257l = resources.getColor(R.color.lb_search_bar_hint_speech_mode);
        this.f1256k = resources.getColor(R.color.lb_search_bar_hint);
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: a */
    public final void mo1040a() {
        this.f1252g.hideSoftInputFromWindow(this.f1246a.getWindowToken(), 0);
    }

    /* renamed from: d */
    private final boolean m1423d() {
        return this.f1247b.isFocused();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1260o = new SoundPool(2, 1, 0);
        Context context = this.f1262q;
        int[] iArr = {R.raw.lb_voice_failure, R.raw.lb_voice_open, R.raw.lb_voice_no_input, R.raw.lb_voice_success};
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            this.f1261p.put(i2, this.f1260o.load(context, i2, 1));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f1260o.release();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1253h = ((RelativeLayout) findViewById(R.id.lb_search_bar_items)).getBackground();
        this.f1246a = (SearchEditText) findViewById(R.id.lb_search_text_editor);
        ImageView imageView = (ImageView) findViewById(R.id.lb_search_bar_badge);
        this.f1246a.setOnFocusChangeListener(new C0386of(this));
        this.f1246a.addTextChangedListener(new C0388oh(this, new C0387og(this)));
        this.f1246a.f1263a = new C0389oi();
        this.f1246a.setOnEditorActionListener(new C0391ok(this));
        this.f1246a.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(R.id.lb_search_bar_speech_orb);
        this.f1247b = speechOrbView;
        speechOrbView.f1264a = new C0392ol(this);
        this.f1247b.setOnFocusChangeListener(new C0393om(this));
        mo1041a(hasFocus());
        m1422c();
    }

    public final void setNextFocusDownId(int i) {
        this.f1247b.setNextFocusDownId(i);
        this.f1246a.setNextFocusDownId(i);
    }

    /* renamed from: b */
    public final void mo1042b() {
        if (!hasFocus()) {
            requestFocus();
        }
    }

    /* renamed from: c */
    private final void m1422c() {
        String string = getResources().getString(R.string.lb_search_bar_hint);
        if (!TextUtils.isEmpty(null)) {
            if (m1423d()) {
                string = getResources().getString(R.string.lb_search_bar_hint_with_title_speech, null);
            } else {
                string = getResources().getString(R.string.lb_search_bar_hint_with_title, null);
            }
        } else if (m1423d()) {
            string = getResources().getString(R.string.lb_search_bar_hint_speech);
        }
        this.f1251f = string;
        SearchEditText searchEditText = this.f1246a;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    /* renamed from: a */
    public final void mo1041a(boolean z) {
        if (!z) {
            this.f1253h.setAlpha(this.f1258m);
            this.f1246a.setTextColor(this.f1254i);
            this.f1246a.setHintTextColor(this.f1256k);
        } else {
            this.f1253h.setAlpha(this.f1259n);
            if (m1423d()) {
                this.f1246a.setTextColor(this.f1257l);
                this.f1246a.setHintTextColor(this.f1257l);
            } else {
                this.f1246a.setTextColor(this.f1255j);
                this.f1246a.setHintTextColor(this.f1257l);
            }
        }
        m1422c();
    }
}
