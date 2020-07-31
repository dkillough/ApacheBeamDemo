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

```sh
export PROJECT="wordcountbeamproj"
export BUCKET="pipeline-demo-storage"
export REGION="us-east1"
```


### run this w

`python wordcount.py --output outputs`

display results w `more outputs*`