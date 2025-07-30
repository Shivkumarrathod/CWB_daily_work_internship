import React from "react";
import {useState} from "react";
import tutorialServices from "../services/Tutorial-Services";
import { Link } from "react-router-dom";



const AddTutorial = ()=>{
    const [tutorial,setTutorial]=useState({
        id:null,
        title:"",
        description:"",
        published:false
    });
    const [submitted,setSubmitted]=useState(false);
    const handleSubmit=(e)=>{
        e.preventDefault();
        const data={
            title:tutorial.title,
            description:tutorial.description
        }
        tutorialServices.create(data)
        .then((response)=>{
            console.log(response.data);
            setTutorial({
                id:response.data.id,
                title:response.data.title,
                description:response.data.description,
                published:response.data.published
            })
            setSubmitted(true);
        })
        .catch((e)=>{
            console.log(e);
        })

    }
    const newTutorial = () => {
    setTutorial({
      id: null,
      title: "",
      description: "",
      published: false
    });
    setSubmitted(false);
    };
    const onChangeTitle=(e)=>{
        setTutorial({...tutorial,title:e.target.value});
    }
    const onChangeDescription=(e)=>{
        setTutorial({...tutorial,description:e.target.value});
    }
    return (
        
        <div className="submit-form">
            <Link to={"/tutorials"}>All Tutorials</Link>
            {submitted ? (<div>
          <h4>You submitted successfully!</h4>
          <button className="btn btn-success" onClick={newTutorial}>
            Add
          </button>
        </div>):(
                <div>
        <h3>Add Tutorial</h3>
        <p>Add Tutorial Component</p>
        <div>
            <p>Title</p>
            <p><input type="text" placeholder="Title" name="title" required value={tutorial.title} onChange={onChangeTitle} /></p>
        </div>
        <div>
            <p>Description</p>
            <p><textarea placeholder="Description" name="description" required value={tutorial.description} onChange={onChangeDescription} ></textarea></p>
        </div>
        <div>
            <p><button  onClick={handleSubmit}>Submit</button></p>
        </div>
        </div>
        )}
        </div>
    )
}
export default AddTutorial;