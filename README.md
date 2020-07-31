# ApacheBeamDemo
Following [WordCount example tutorials](https://beam.apache.org/get-started/wordcount-example/) / [Google Cloud Quickstart Demo](https://cloud.google.com/dataflow/docs/quickstarts/quickstart-python)

<hr />

```sh
export GOOGLE_APPLICATION_CREDENTIALS="[PATH/TO/JSON/CREDS]"
```

// *reminder that zsh requires `' '` around package names zz*
```sh
pip install apache-beam
pip install 'apache-beam[gcp]' 
```

### run this w

`python wordcount.py --output outputs`

display results w `more outputs*`