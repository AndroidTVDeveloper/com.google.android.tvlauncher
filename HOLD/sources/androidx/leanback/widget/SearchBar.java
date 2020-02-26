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
    public SearchEditText a;
    public SpeechOrbView b;
    public String c;
    public final Handler d;
    public boolean e;
    private String f;
    private final InputMethodManager g;
    private Drawable h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private int m;
    private int n;
    private SoundPool o;
    private SparseIntArray p;
    private final Context q;

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
    public SearchBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = new Handler();
        this.e = false;
        this.p = new SparseIntArray();
        this.q = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate((int) R.layout.lb_search_bar, (ViewGroup) this, true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.lb_search_bar_height));
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.c = "";
        this.g = (InputMethodManager) context.getSystemService("input_method");
        this.j = resources.getColor(R.color.lb_search_bar_text_speech_mode);
        this.i = resources.getColor(R.color.lb_search_bar_text);
        this.n = resources.getInteger(R.integer.lb_search_bar_speech_mode_background_alpha);
        this.m = resources.getInteger(R.integer.lb_search_bar_text_mode_background_alpha);
        this.l = resources.getColor(R.color.lb_search_bar_hint_speech_mode);
        this.k = resources.getColor(R.color.lb_search_bar_hint);
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
    }

    public final void a() {
        this.g.hideSoftInputFromWindow(this.a.getWindowToken(), 0);
    }

    private final boolean d() {
        return this.b.isFocused();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = new SoundPool(2, 1, 0);
        Context context = this.q;
        int[] iArr = {R.raw.lb_voice_failure, R.raw.lb_voice_open, R.raw.lb_voice_no_input, R.raw.lb_voice_success};
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[i2];
            this.p.put(i3, this.o.load(context, i3, 1));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.o.release();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.h = ((RelativeLayout) findViewById(R.id.lb_search_bar_items)).getBackground();
        this.a = (SearchEditText) findViewById(R.id.lb_search_text_editor);
        ImageView imageView = (ImageView) findViewById(R.id.lb_search_bar_badge);
        this.a.setOnFocusChangeListener(new of(this));
        this.a.addTextChangedListener(new oh(this, new og(this)));
        this.a.a = new oi();
        this.a.setOnEditorActionListener(new ok(this));
        this.a.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(R.id.lb_search_bar_speech_orb);
        this.b = speechOrbView;
        speechOrbView.a = new ol(this);
        this.b.setOnFocusChangeListener(new om(this));
        a(hasFocus());
        c();
    }

    public final void setNextFocusDownId(int i2) {
        this.b.setNextFocusDownId(i2);
        this.a.setNextFocusDownId(i2);
    }

    public final void b() {
        if (!hasFocus()) {
            requestFocus();
        }
    }

    private final void c() {
        String string = getResources().getString(R.string.lb_search_bar_hint);
        if (!TextUtils.isEmpty(null)) {
            if (d()) {
                string = getResources().getString(R.string.lb_search_bar_hint_with_title_speech, null);
            } else {
                string = getResources().getString(R.string.lb_search_bar_hint_with_title, null);
            }
        } else if (d()) {
            string = getResources().getString(R.string.lb_search_bar_hint_speech);
        }
        this.f = string;
        SearchEditText searchEditText = this.a;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    public final void a(boolean z) {
        if (!z) {
            this.h.setAlpha(this.m);
            this.a.setTextColor(this.i);
            this.a.setHintTextColor(this.k);
        } else {
            this.h.setAlpha(this.n);
            if (d()) {
                this.a.setTextColor(this.l);
                this.a.setHintTextColor(this.l);
            } else {
                this.a.setTextColor(this.j);
                this.a.setHintTextColor(this.l);
            }
        }
        c();
    }
}
